# Compte Rendu Atelier I - ASI

Compte Rendu de l'Atelier I du module ASI (Architecture des Systèmes d'Informations)

Questions Atelier : Les questions réponses de cette atelier sont dans le fichier ./AtelierI_Questions.md

## Cmparaison Web statique vs Web dynamique

### Web Statique

Architecture deux tiers, composé d'un serveur back-end et front-end, la partie front-end s'occupe de transmettre les fichier (html, css, js) à travers des requêtes HTTP. Une fois les fichiers récupérés par le navigateur, ce dernier va faire le rendu HTML/CSS et interpréter le JS. Le but dans notre projet est que à travers le code JS d'effectuer des requêtes HTTP (AJAX) pour récupérer les informations du back-end. C'est à travers ces échanges qu'une notion dynamique peut être apporté au projet. Pour illustrer cette explication les SPA (Single Page Application) sont un bon exemple. La partie back-end du projet static est un Java EE server qui à travers des Services permet de renvoyer les données voulu à partir des endpoits définis.

### Web Dynamique

Architecture trois tiers, composée d'un serveur d'application, qui écoutera via les servlets, les requêtes HTTP et retournera une réponse. Le but est de pouvoir transmettre un résultat dynamique et d'envoyer du contenu HTML pré-compilé avec les informations nécessaire au rendu de la page. Une fois ces données récupérées, elles sont affichées à l'utilisateur via des pages servlets qui ont été générées par la conversion de pages JSP.

### Comparaison



| Notion | Web Dynamique | Web Statique |
| ----------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Compilation | Compilation des informations côté serveur pour transmettre un fichier HTML prêt à l'emploi | Récupération d'un fichier HTML généric pour récupérer les informations spécifique et dynamique à travers du JS. |
| Portabilité | Il y a un couplage fort entre la partie front du projet et la partie logique. Car lors de la génération de la page les données métiers sont importantes. | Permet de découpler la partie front de la partie logique du métier. Cela permet d'utiliser un web service pour une application web et une application mobile par exemple. |
| Transaction | Une seule transaction la requête HTTP pour récupérer les informations et non pas des aller retours entre le front et le back. Cela peut être contesté dans le fait que pour chaque changement de page il va falloir refaire un appel HTTP pour récupérer à nouveau le contenu HTML. | De nombreuses transactions entre la partie front et back pour récupérer les informations |
| Vitesse | - Les points forts sont : | - Les points forts sont : |
| | Un chargement par page et donc les ralentissements réseaux sont moins impactant. Les interactions avec la base de données sont directs il est donc de récupérer différents type de données en une seule connexion sans avoir besoin de faire plusieurs transactions. | Nécessite de refaire des appels uniquement pour les changements effectué sur la page et non récupérer la page entière |
| | Les points faibles sont : | Les points faibles sont : |
| | Pour chaque changement de page cela necessite de refaire appel au serveur pour récupérer le nouveau fichier HTML, il est donc possible que pour le cas des navbars de récupérer pour chaque page les informations utilisateurs alors quelles n'ont pas changé. | Beaucoup d'interactions entre le front et le back, pour le changement de page il est possible de récupérer différents types de données et donc faire plusieurs appels HTTP pour un chargement de page. |



## Cahier des charges

### Elements réalisés du cahier des charges

Lors de la mise en place d'une solution Web statique basée sur l'exemple WebServiceCardPostgresqlFichier. le lancement du serveur n'a pas fonctionné.

WIP: Mise en place d'un serveur Web Dynamique en utilisant la technologie JEE et tout particulièrement les JSP, les
Servlets, les Javabeans et une connexion à un base de données existante via JDBC.

### Elements non-réalisés du cahier des charges

### Eléments éventuels réalisés en plus du cahier des charges

## Sources

Repository GitHub (web dynamique): https://github.com/eloiblt/ASI-Atelier1-Dynamique

## Contributeurs

BELDJILLAI Iliès, BELLET Eloi, FOLLEAS Brice, MITTELETTE Nathan
