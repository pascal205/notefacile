# 📝 NoteFacile

**NoteFacile** est une application de bureau de prise de notes développée en Java. Elle utilise Java Swing pour son interface graphique et FlatLaf pour lui donner une apparence moderne.

🚧 **Le projet est actuellement à ses débuts.** Il s'agit d'une application basique que je souhaite faire évoluer progressivement en y intégrant de nouvelles fonctionnalités et en améliorant continuellement son interface et son fonctionnement.

🎯 **Mon objectif :** transformer progressivement NoteFacile en une application de prise de notes plus complète, pratique et agréable à utiliser.

---

## 🚧 État du projet

NoteFacile est actuellement dans une première phase de développement. Cette version constitue une base de travail sur laquelle je compte m'appuyer pour construire une application plus aboutie.

Le projet est conçu pour évoluer au fil du temps. Je souhaite notamment enrichir ses fonctionnalités, améliorer l'expérience utilisateur et explorer de nouvelles possibilités afin de rendre l'application plus utile au quotidien.

Ce projet représente également une occasion de mettre en pratique mes connaissances en Java, de renforcer mes compétences en développement logiciel et d'expérimenter de nouvelles approches de conception.

**NoteFacile n'en est qu'à ses débuts : de nombreuses améliorations restent à venir !**

## ✨ Fonctionnalités actuelles

L'application repose sur une interface graphique de bureau développée avec Java Swing et FlatLaf.

Les fonctionnalités présentées dans cette section sont à compléter selon ce qui est réellement opérationnel dans la version actuelle du projet.

- 📝 Une application dédiée à la prise de notes.
- 🖥️ Une interface graphique de bureau.
- 🎨 Une apparence personnalisée grâce à FlatLaf.
- 🧩 Une base de code Java destinée à évoluer progressivement.

## 🛠️ Technologies utilisées

| Technologie | Rôle |
|---|---|
| ☕ Java 17 | Langage de programmation |
| 🖥️ Java Swing | Création de l'interface graphique |
| 🎨 FlatLaf | Personnalisation de l'interface |
| 📦 Apache Maven | Gestion du projet et des dépendances |
| 🔧 Git | Gestion des versions |
| 🐙 GitHub | Hébergement du code source |

## 📋 Prérequis

Pour installer et exécuter le projet, tu auras besoin de :

- **JDK 17** ou d'une version compatible avec la configuration du projet.
- **Apache Maven**, pour compiler le code et gérer les dépendances.
- Un environnement de développement Java, comme IntelliJ IDEA, Eclipse, NetBeans ou Visual Studio Code configuré pour Java.

## 🚀 Installation

### 1. Cloner le dépôt

Ouvre un terminal et exécute la commande suivante :

```bash
git clone https://github.com/pascal205/notefacile.git
```

### 2. Accéder au dossier du projet

```bash
cd notefacile
```

### 3. Compiler le projet

À la racine du projet, exécute :

```bash
mvn clean package
```

Cette commande nettoie les anciens fichiers générés, compile le code source et exécute les étapes de construction configurées dans Maven.

### 4. Lancer l'application

Ouvre le projet dans ton IDE Java, laisse Maven télécharger les dépendances nécessaires, puis exécute la classe principale contenant la méthode `main()`.

> 💡 Le lancement exact dépend de la classe principale et de la configuration Maven du projet.

## 📁 Structure du projet

Le projet utilise Maven pour organiser le code source et les ressources. Voici un exemple d'arborescence possible :

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

*Cette structure est indicative et doit être adaptée à l'organisation réelle du dépôt.*

## 🎨 Interface utilisateur

NoteFacile utilise Java Swing pour construire son interface graphique et FlatLaf pour personnaliser son apparence.

L'objectif est de proposer une interface claire, agréable et facile à utiliser, tout en conservant une base technique permettant d'intégrer de nouvelles fonctionnalités à l'avenir.

Une capture d'écran de l'application pourra être ajoutée ici afin de présenter son interface actuelle.

Exemple d'intégration d'une capture d'écran :

```markdown
![Aperçu de NoteFacile](docs/images/notefacile-preview.png)
```

Pour que l'image s'affiche, il faudra ajouter une véritable capture d'écran à cet emplacement dans le dépôt.

## 🗺️ Feuille de route

Le développement de NoteFacile se poursuivra progressivement. Voici quelques pistes d'amélioration envisagées pour les prochaines versions.

- [ ] Ajouter la recherche de notes.
- [ ] Intégrer un système de sauvegarde et de chargement des notes.
- [ ] Organiser les notes par catégories ou dossiers.
- [ ] Améliorer la personnalisation de l'interface.
- [ ] Ajouter de nouvelles fonctionnalités selon les besoins identifiés.
- [ ] Améliorer progressivement la structure et la maintenabilité du code.
- [ ] Mettre en place des tests automatisés.
- [ ] Préparer une version exécutable plus facile à distribuer.

Cette feuille de route n'est pas définitive. Les priorités pourront évoluer au fur et à mesure du développement et des nouvelles idées que je souhaiterai explorer.

## 🔧 Participer au développement

NoteFacile est un projet évolutif. Toute suggestion pertinente ou proposition d'amélioration peut contribuer à sa progression.

Pour proposer une contribution :

1. Fork le dépôt.
2. Crée une branche pour ta modification.
3. Effectue tes changements.
4. Vérifie que le projet compile correctement.
5. Soumets une Pull Request en décrivant les améliorations proposées.

## 👨‍💻 Auteur

**AMETEPE Pascal**

Développeur en formation en développement web et mobile, passionné par la création d'applications utiles et la conception d'interfaces modernes.

- **GitHub :** [@pascal205](https://github.com/pascal205)
- **Dépôt du projet :** [NoteFacile](https://github.com/pascal205/notefacile)

## 📄 Licence

Aucune licence n'est précisée dans ce README. La licence du projet devra être choisie et ajoutée au dépôt dans un fichier `LICENSE` si tu souhaites définir les conditions de réutilisation et de modification du code.

---

⭐ **Merci de t'intéresser à NoteFacile !**

Ce projet est encore à ses débuts, mais il continuera d'évoluer au fil des améliorations et des nouvelles fonctionnalités que je souhaite lui apporter.
