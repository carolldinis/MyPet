# My Pet

This is an Android project developed in Kotlin using Android Studio. The aim of this project is to create an app with two screens: a welcome screen and a screen with buttons to feed, clean, and play with a virtual pet, where each button changes the displayed image on the screen.

## Project Structure

The project consists of the following main files and folders:

-   **app/src/main/java/com.example.petproject/**: Contains the Kotlin files of the application.
    
    -   **MainActivity.kt**: Class responsible for the welcome screen. On this screen, a TextView "Get Started" is displayed, and when clicked, the user is directed to the second screen.
    -   **SecondActivity.kt**: Class responsible for the second screen. Here, there are buttons to feed, clean, and play with the virtual pet. Clicking any of these buttons changes the image displayed on the screen.
-   **app/src/main/res/layout/**: Contains the XML layout files of the application screens.
    
    -   **activity_main.xml**: Layout of the welcome screen. Contains a TextView with the text "Get Started".
    -   **activity_second.xml**: Layout of the second screen. Contains buttons to feed, clean, and play, as well as an ImageView to display the pet image.
-   **app/src/main/res/drawable/**: Folder containing the images used in the application.
    

## App Functionality

1.  **Welcome Screen (MainActivity)**:
    
    -   When opening the app, the user is greeted with a welcome screen containing a TextView with the text "Get Started".
    -   Clicking on the "Get Started" text directs the user to the second screen.
2.  **Second Screen (SecondActivity)**:
    
    -   On this screen, there are three buttons: "Feed", "Clean", and "Play", and an ImageView to display the pet image.
    -   Clicking one of the buttons changes the pet image according to the action performed ("Feed" = feed, "Clean" = clean, "Play" = play).
   
## Author:

-   Carol Dinis - Developer
-   Student number - ST10459134
