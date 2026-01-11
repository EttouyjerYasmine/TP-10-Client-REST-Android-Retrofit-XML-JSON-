# 📱 Gestion de Comptes Bancaires - TP Android REST Client

## 📋 Description
Application Android pour gérer des comptes bancaires via un service REST avec Retrofit. TP universitaire avec fonctionnalités CRUD complètes.

## 🚀 Fonctionnalités
- ✅ Liste des comptes (RecyclerView)
- ✅ Ajout de nouveaux comptes
- ✅ Modification des comptes
- ✅ Suppression des comptes
- ✅ Support JSON/XML
- ✅ Material Design

## 🛠 Technologies
- Java
- Android Studio
- Retrofit 2
- RecyclerView
- Material Design

## 📁 Structure du projet
```
app/src/main/
├── java/ma/projet/restclient/
│   ├── MainActivity.java
│   ├── adapter/CompteAdapter.java
│   ├── entities/Compte.java
│   ├── api/
│   │   ├── CompteService.java
│   │   └── RetrofitClient.java
│   └── repository/CompteRepository.java
├── res/layout/
│   ├── activity_main.xml
│   ├── item_compte.xml
│   └── dialog_add_compte.xml
└── AndroidManifest.xml
```

## ⚙️ Installation
1. **Cloner le projet**
2. **Ouvrir avec Android Studio**
3. **Configurer le serveur backend** sur `http://10.0.2.2:8080`
4. **Exécuter sur émulateur** (API 24+)

## 🔧 Configuration requise
- Android Studio 2023+
- Android SDK API 24 minimum
- Serveur REST backend (ex: Spring Boot)
- Émulateur ou appareil Android

## 📞 API Endpoints
| Méthode | Endpoint | Action |
|---------|----------|--------|
| GET | `/api/comptes` | Liste tous les comptes |
| POST | `/api/comptes` | Crée un compte |
| PUT | `/api/comptes/{id}` | Modifie un compte |
| DELETE | `/api/comptes/{id}` | Supprime un compte |

## 🐛 Dépannage rapide
- **Appli crash au démarrage** : Vérifier Logcat pour l'erreur
- **Pas de connexion** : Vérifier `network_security_config.xml`
- **Erreur Retrofit** : Vérifier les dépendances Gradle

## 📚 Pour commencer
1. Lancer Android Studio
2. Ouvrir le projet
3. Exécuter sur émulateur (▶️)
4. Tester avec le serveur backend

---
**Auteur** : Ettouyjer yasmine 
**Professeur** : Mr.Mohamed Lechgar
**Date** :  le 11-01-2026

