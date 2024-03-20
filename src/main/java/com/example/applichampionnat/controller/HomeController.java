package com.example.applichampionnat.controller;

import com.example.applichampionnat.pojos.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HttpSession httpSession;

    public HomeController() {

    }

    @PostMapping("/logInOff")
    public ModelAndView authentification(@RequestParam("action") String action) {
        ModelAndView view = new ModelAndView();
        if ("login".equals(action)) {
            view.setViewName("login");
            view.addObject("isInscription", false);
            view.addObject("isConnected", false);
            return view;
        } else if ("logout".equals(action)) {
            view.setViewName("login");
            view.addObject("isConnected", false);
            view.addObject("isInscription", false);
            httpSession.removeAttribute("authenticatedMembre");
            return view;
        }
        return view;
    }


    @PostMapping(value = {"/auth"})
    public ModelAndView signOrLogIn(User user, @RequestParam(name = "isInscription", defaultValue = "false") boolean isInscription) {
        ModelAndView view = new ModelAndView();
        List<String> errorList = new ArrayList<>();
        if (isInscription) {
            //Logique d'inscription
            // Validation des champs
            if (user.getNom() == null || user.getPseudo() == null || user.getEmail() == null || user.getMdp() == null
                    || user.getNom().isEmpty() || user.getPseudo().isEmpty() || user.getEmail().isEmpty() || user.getMdp().isEmpty()) {
                errorList.add("Veuillez remplir tous les champs.");
            }

            // Vérification de l'existence de l'email
            if (user.getEmail() != null) {
                errorList.add("L'adresse email est déjà utilisée.");
            }

            // Si des erreurs sont détectées, retourner à la page d'inscription avec les messages d'erreur
            if (!errorList.isEmpty()) {
                view.setViewName("login");
                view.addObject("errors", errorList);
                view.addObject("isInscription", true);
                view.addObject("isConnected", false);
                return view;
            }

            // Si aucune erreur, procéder à l'inscription et à la connexion

            httpSession.setAttribute("authenticatedMembre", new Object());
            view.addObject("isConnected", true);

            view.setViewName("redirect:/");

        } else {
            // Traitement de la connexion
            if (user.getEmail() == null || user.getMdp() == null
                    || user.getEmail().isEmpty() || user.getMdp().isEmpty()) {
                errorList.add("Veuillez remplir tous les champs.");
            } else {
                //User authenticatedUser = userService.authenticateUser(user, errorList);
//                if (authenticatedUser != null) {
//                    // Stocker l'utilisateur authentifié dans la session
//                    httpSession.setAttribute("authenticatedMembre", authenticatedUser);
//                    view.addObject("isConnected", true);
//                    view.setViewName("redirect:/recettes");
//                } else {
//                    errorList.add("Adresse email inconnu");
//                }
            }
            }
        if (!errorList.isEmpty()) {
            view.setViewName("login");
            view.addObject("errors", errorList);
            view.addObject("isInscription", false);
            view.addObject("isConnected", false);
        }

        return view;
    }

    @GetMapping("/")
    public ModelAndView accueil() {
        ModelAndView view = new ModelAndView();
        view.addObject("isConnected", false);
        // Vérification de l'authentification à chaque accès à la page d'accueil
        User authenticatedMembre = (User) httpSession.getAttribute("authenticatedMembre");
        if (authenticatedMembre != null) {
            view = new ModelAndView("redirect:/recettes");
            view.addObject("membre", authenticatedMembre);
            view.addObject("pseudo", authenticatedMembre.getPseudo());
            view.addObject("isConnected", true);

        } else {
            view.setViewName("login");
            view.addObject("isInscription", false);
            view.addObject("isConnected", false);
            view.addObject("errors", Collections.singletonList("Veuillez vous connecter."));
        }

        return view;
    }

    @GetMapping("/inscription")
    public ModelAndView showInscriptionPage() {
        ModelAndView view = new ModelAndView();
        httpSession.removeAttribute("authenticatedMembre");
        view.setViewName("login");
        view.addObject("isInscription", true);
        view.addObject("isConnected", false);
        return view;
    }

    @GetMapping("/acceuil")
    public ModelAndView showAcceuil() {
        ModelAndView view = new ModelAndView();

        return view;
    }
}
