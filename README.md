# compte-service
 
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
 On implémenter dans ce classe une méthode qui récuperé tout les comptes dans la base de données.<br>
 Et on utilise l'annotation @GetMapping(path = "/comptes") pour accéder à la base de données et retourne tout les comptes.<br>
 Voici le résultat sous format de JSON : 
</p>

![image](https://user-images.githubusercontent.com/61559275/163743578-04082857-584c-4104-8210-4fac0902148f.png)






















