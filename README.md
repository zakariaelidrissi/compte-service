# compte-service
 
# *****************************************************
# Zakaria EL Idrissi
# Master Intelligence Artificiel et Analyse De Données
# Faculté des sciences Meknès
# zak.elidrissi@edu.umi.ac.ma
# *****************************************************
 
<h1>PARTIE 1 : </h1>
<p>
 Dans cette partie on va créer une classe qu'on appele Compte.<br>
 puis on va créer une interface qu'on appele CompteRepository qui hérite JpaRepository.<br>
 après on ajouter les informations de la base de données spring.h2 dans le fichier application.properties.
</p>
<p>
 Après on va exécuter l'application et le serveur Tomcat de spring.<br>
 Voici le résultat : 
</p>

![image](https://user-images.githubusercontent.com/61559275/163741035-66f76798-7290-43f8-ab31-945523bd8dd4.png)

<p>
 Puis on va Taper dans mon browser localhost:8080/h2-console pour passe à la base de données.<br>
 Voici le résultat : 
</p>

![Capture_db](https://user-images.githubusercontent.com/61559275/163741214-66e74e2d-1bd5-4448-9b35-4c3a0bfe1fa6.PNG)

<p> Voilla la table Compte qui à été créer dans la base de données</p>

![image](https://user-images.githubusercontent.com/61559275/163741341-73d3e8c3-0ad6-4a0d-8e97-c5f933989d7e.png)


<p>
 Après on va créer un nouvelle classe qu'on appele CompteRestController qui utilise l'annotation @RestController.<br>
 On implémenter dans ce classe une méthode (listComptes) qui récuperé tout les comptes dans la base de données.<br>
 Et on utilise l'annotation @GetMapping(path = "/comptes") pour accéder à la base de données et retourne tout les comptes.<br>
 Voici le résultat sous format de JSON : 
</p>

![image](https://user-images.githubusercontent.com/61559275/172948209-32684312-43da-43df-a58c-990325664db6.png)

<p>
 On ajoute un autre méthode dans la meme classe pour consulté un compte
</p>

<p> Voici un exemple : </p>

![image](https://user-images.githubusercontent.com/61559275/172949029-2f9d6cb2-873b-41d7-8e38-428c2895f24c.png)
 

<p>
 On ajoute autres méthodes dans la classe CompteRestController :
 <ul>
  <li>save() qui utilise l'annotation @PostMapping et pour enregistré un compte</li>
  <li>update() qui utilise l'annotation @PutMapping et pour modifier un compte</li>
  <li>delete() qui utilise l'annotation @DeleteMapping et pour supprimer un compte</li>
 </ul>   
</p>
<p>
 Pour fait un test sur la méthode save() on utilise l'application Postman<br>
 Voici un exemple :
</p>

![image](https://user-images.githubusercontent.com/61559275/163825300-0ba1a590-5c8f-4478-bb92-20e20356aeed.png)

![image](https://user-images.githubusercontent.com/61559275/163825755-a2fc592d-9c12-4bca-a54a-c3900a3f48b7.png)

<p> Voici le résultat : </p>

![image](https://user-images.githubusercontent.com/61559275/163825848-7e5b2f9d-a4a5-44c6-b122-ef2f6b49ac22.png)

<p> 
 Pour créer la documentation se l'api on utilise SWAGGER
 Alors on ajoute la dépendence de springdoc dans le fichier pom.xml<br>
</p>

<p> Voici un exemple </p>

![image](https://user-images.githubusercontent.com/61559275/172950866-b227a29f-ddc0-42b3-87ec-105a5c8a7478.png)

<p> 
 puis une importe cette documentation dans Postman
</p>

![image](https://user-images.githubusercontent.com/61559275/163828501-b4282a1f-e4cc-429c-a077-75a9bb934ee7.png)

<p>
 On utilise aussi SWAGGER pour fait un test 
</p>

![image](https://user-images.githubusercontent.com/61559275/163834477-fc9d4d7a-8515-4d60-a469-be1ae0f4dbad.png)

<p>
 Voici un exemple pour ajouter un compte avec SWAGGER :
</p>

![image](https://user-images.githubusercontent.com/61559275/163834576-ca42b6e4-c79b-4531-aa6b-516d4a8df19c.png)

<p>
 On peut ajouter des projections pour consulter les comptes avec des données précisés
</p>

<p> Voici un exemple </p>

![image](https://user-images.githubusercontent.com/61559275/172953096-ba11fee0-01e3-4512-953d-482b4f06cb64.png)

<p>
 Maintenant on va créer une interface qui contient une méthode virement pour faire des virements entre les comptes.<br>
 Puis on va créer une classe qui implémenté cette interface.<br>
</p>

<p> Voici un exemple de virement avec swagger </p>
<p> Dans cette exemple on fait un virement du compte numero 1 vers le compte numero 2 </p>

![image](https://user-images.githubusercontent.com/61559275/172955597-487326cb-bd49-452b-a55b-176b256afc79.png)

![image](https://user-images.githubusercontent.com/61559275/172955946-907a5971-c33a-469a-bf14-23512df0708b.png)

<p> Le résultat après le virement </p>

![image](https://user-images.githubusercontent.com/61559275/172956033-44dfdd93-cbae-402e-b6a8-ac1fbd4c9206.png)



