package com.example;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.microsoft.aad.adal4j.AuthenticationResult;
import com.lead.email.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken.TokenType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.microsoft.aad.adal4j.AuthenticationResult;
@RestController
public class LeadController {
	@Autowired
	private EmailServiceImpl emailService;
	@Autowired
	private LeadRepository leadRespository;
	@Autowired
	private SalesPersonRepository salesPersonRepository;
	@Autowired
private RestTemplate restTemplate;
	@Autowired
	@PreAuthorize("hasRole('ContactInfo')")
	   @RequestMapping("/")
	public String index() {
		return "Hello world";
	}

	
	@GetMapping("/account")
    public Authentication getAccount(HttpServletRequest httpRequest) {
//		 HttpSession session = httpRequest.getSession();
//		 AuthenticationResult result = (AuthenticationResult) session.getAttribute("principal");
//		 System.out.println(result.getAccessToken());
        return SecurityContextHolder.getContext().getAuthentication();
    }
	
	
//   @PreAuthorize("hasRole('ContactInfo')")
//   @RequestMapping("/")
//   public String helloWorld() {
//      return "Hello World!";
//   }
   @PreAuthorize("hasRole('ContactInfo')")
	@GetMapping("/api/leads")
	public List<Lead> getLeads() {
		List<Lead> leads = leadRespository.findAll();
		return leads;
	}

	
	 @GetMapping("/api/salesperson/{company}")
	 public List<SalesPerson> getSalesPerson(@PathVariable(name="company")String company) {
	  return salesPersonRepository.findByCompany(company);
	 }
	 @GetMapping("/api/salespersons")
	 public List<SalesPerson> getSalesPersonList() {
	  return salesPersonRepository.findAll();
	 }

	@PostMapping("/api/lead")
	public @ResponseBody List<SalesPerson> createLead(@RequestBody Lead lead) {
		leadRespository.save(lead);

		List<SalesPerson> salespersons = salesPersonRepository.findByCompany(lead.getCompany());
		emailService.sendSimpleMessage(salespersons.get(0).getEmail(), "demo", lead.getLeadDescription());
		return salespersons;
//	  System.out.println("New Lead Saved Successfully");
	}

}