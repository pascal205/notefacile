# 📝 NoteFacile

**NoteFacile** est une application de bureau développée en Java, conçue pour offrir une expérience simple et agréable de prise de notes. Son interface moderne s'appuie sur Java Swing et FlatLaf, tandis que Maven facilite la gestion du projet et de ses dépendances.

> 🎯 **Objectif :** créer une application de prise de notes pratique, avec une interface soignée et une base technique facile à faire évoluer.

## ✨ Fonctionnalités

- 📝 **Prise de notes** — un espace dédié à la gestion de notes.
- 🖥️ **Interface graphique** — une application de bureau basée sur Java Swing.
- 🎨 **Design moderne** — utilisation de FlatLaf pour améliorer l'apparence de l'interface.
- 🧩 **Architecture Java** — organisation du code en classes pour faciliter la maintenance.
- 📦 **Gestion des dépendances** — utilisation de Maven pour structurer le projet.

*Les fonctionnalités détaillées sont à adapter à la version actuelle de l'application.*

## 🛠️ Technologies utilisées

| Technologie | Utilisation |
|---|---|
| Java 17 | Langage de programmation |
| Java Swing | Création de l'interface graphique |
| FlatLaf | Personnalisation de l'interface |
| Apache Maven | Gestion du projet et des dépendances |
| Git & GitHub | Gestion des versions et hébergement du code |

## 📋 Prérequis

Avant de commencer, assure-toi de disposer des éléments suivants :

- **JDK 17** ou une version compatible avec le projet.
- **Apache Maven** pour compiler et gérer les dépendances.
- Un IDE Java, comme IntelliJ IDEA, Eclipse ou NetBeans, ou Visual Studio Code configuré pour Java.

## 🚀 Installation

### 1. Cloner le dépôt

```bash
git clone https://github.com/pascal205/notefacile.git
```

### 2. Accéder au projet

```bash
cd notefacile
```

### 3. Compiler le projet

À la racine du projet, exécute :

```bash
mvn clean package
```

Cette commande nettoie les fichiers de compilation précédents, compile le code et exécute les étapes de construction configurées dans Maven.

### 4. Lancer l'application

Ouvre le projet dans ton IDE Java, laisse Maven télécharger les dépendances, puis exécute la classe principale qui contient la méthode `main()`.

> 💡 Le nom exact de la classe principale dépend de l'organisation du code source. Le lancement direct avec un fichier JAR nécessite également que le JAR soit configuré pour être exécutable.

## 📁 Structure du projet

Le projet suit une organisation Java avec Maven. Voici la structure standard attendue :

```text
notefacile/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── notefacile/
│   │   └── resources/
│   └── test/
├── pom.xml
├── README.md
└── .gitignore
```

Cette arborescence est indicative : elle doit être adaptée aux fichiers réellement présents dans le dépôt.

## 🎨 Interface utilisateur

NoteFacile met l'accent sur une interface graphique claire et moderne, rendue possible par Java Swing et FlatLaf.

Pour présenter le résultat visuellement, tu peux ajouter une capture d'écran de l'application dans le dépôt :

```markdown
![Interface de NoteFacile](docs/images/notefacile-preview.png)
```

Remplace ce chemin par celui d'une capture d'écran réellement ajoutée au projet.

## 🔧 Développement

Pour travailler sur le projet :

1. Clone le dépôt.
2. Ouvre le projet dans ton environnement Java.
3. Vérifie la configuration Maven dans `pom.xml`.
4. Modifie les classes nécessaires.
5. Compile le projet avec `mvn clean package`.
6. Teste les modifications avant de les publier.

## 🗺️ Améliorations futures

Voici quelques pistes d'évolution possibles :

- [ ] Ajouter la recherche de notes.
- [ ] Permettre de classer les notes par catégories.
- [ ] Ajouter la sauvegarde et le chargement des notes.
- [ ] Améliorer la personnalisation de l'interface.
- [ ] Ajouter des tests automatisés.
- [ ] Préparer une version exécutable facile à installer.

Ces éléments constituent des idées d'évolution et ne sont pas nécessairement disponibles dans la version actuelle.

## 🤝 Contributions

Les suggestions, signalements de bugs et propositions d'amélioration sont les bienvenus.

Pour proposer une contribution :

1. Fork le dépôt.
2. Crée une branche pour ta modification.
3. Effectue tes changements et vérifie que le projet compile.
4. Soumets une Pull Request en expliquant les améliorations apportées.

## 👨‍💻 Auteur

**AMETEPE Pascal**

Développeur en formation en développement web et mobile, intéressé par la création d'applications utiles et d'interfaces modernes.

- GitHub : [@pascal205](https://github.com/pascal205)
- Projet : [NoteFacile](https://github.com/pascal205/notefacile)

## 📄 Licence

Aucune licence n'est indiquée ici. Si tu souhaites autoriser la réutilisation et la modification du code, choisis une licence adaptée, puis ajoute le fichier `LICENSE` correspondant au dépôt.

---

⭐ **Merci de découvrir NoteFacile !**
