package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aezzat
 */
@Controller
public class AuthorController
{
	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository){
		this.authorRepository=authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model){
		model.addAttribute("authors",authorRepository.findAll());
		return "authors";
	}
}
