package Products;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import Products.model.p9;
import Settings.SettingsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CustomizeController implements Initializable {
    
    @FXML
    public TextField filodroidNameField;

    @FXML
    public Label filodroidNameLabel;

    @FXML
    public Rectangle filodroidNameRectangle;

    @FXML
    public Button optionHair, optionEyebrows, optionEyes, optionMouth, optionSkin, optionOutfits, next, prev;

    @FXML
    public Button hair1aButton, hair1bButton, hair2aButton, hair2bButton, noHairButton;

    @FXML
    public Button brow1Button, brow2Button, brow3Button, brow4Button, brow5Button, brow6Button, brow7Button, brow8Button;

    @FXML
    public Button eye1Button, eye2Button, eye3aButton, eye3bButton, eye4aButton, eye4bButton, eye5aButton, eye5bButton;

    @FXML
    public Button mouth1Button, mouth2Button, mouth3Button, mouth4Button, mouth5Button, mouth6Button;

    @FXML
    public Button skin1Button, skin2Button, skin3Button, skin4Button;

    @FXML
    public Button outfit1Button, outfit2Button, outfit3Button, outfit4Button, outfit5Button, outfit6Button, outfit7Button,
        outfit8Button, backAButton, backBButton;

    @FXML
    public ImageView hair1a, hair1b, hair2a, hair2b;

    @FXML
    public ImageView brow1, brow2, brow3, brow4, brow5, brow6, brow7, brow8;

    @FXML
    public ImageView eye1, eye2, eye3a, eye3b, eye4a, eye4b, eye5a, eye5b;

    @FXML
    public ImageView mouth1, mouth2, mouth3, mouth4, mouth5, mouth6;

    @FXML
    public ImageView skin1, skin2, skin3, skin4;

    @FXML
    public ImageView outfit1, outfit2, outfit3, outfit4, outfit5, outfit6, outfit7, outfit8, backA, backB;

    @FXML
    public AnchorPane hairGroup, eyebrowsGroup, eyesGroup, mouthGroup, skinGroup, outfitGroup1, outfitGroup2;


    public String filodroidCustomName = "";
    public static Boolean filodroidCustomCheck = false;

    public static p9 product9 = new p9();

    private Map<Button, ImageView> hairMap = new HashMap<>();
    private Map<Button, ImageView> eyebrowsMap = new HashMap<>();
    private Map<Button, ImageView> eyesMap = new HashMap<>();
    private Map<Button, ImageView> mouthMap = new HashMap<>();
    private Map<Button, ImageView> skinMap = new HashMap<>();
    private Map<Button, ImageView> outfitMap = new HashMap<>();
    private Map<Button, ImageView> backMap = new HashMap<>();
    
    public static List<ImageView> customSelected = new ArrayList<>();
    
    public static int customizeGoBackCount = 0;
    
    public static Boolean backACheck = false;
    public static Boolean backBCheck = false;
    
    public static Boolean skin1Check = false;
    public static Boolean skin2Check = false;
    public static Boolean skin3Check = false;
    public static Boolean skin4Check = false;
    
    public static Boolean eyebrows1Check = false;
    public static Boolean eyebrows2Check = false;
    public static Boolean eyebrows3Check = false;
    public static Boolean eyebrows4Check = false;
    public static Boolean eyebrows5Check = false;
    public static Boolean eyebrows7Check = false;
    public static Boolean eyebrows6Check = false;
    public static Boolean eyebrows8Check = false;
    
    public static Boolean hair1Check = false;
    public static Boolean hair2Check = false;
    public static Boolean hair3Check = false;
    public static Boolean hair4Check = false;
    
    public static Boolean eyes1Check = false;
    public static Boolean eyes2Check = false;
    public static Boolean eyes3Check = false;
    public static Boolean eyes4Check = false;
    public static Boolean eyes5Check = false;
    public static Boolean eyes6Check = false;
    public static Boolean eyes7Check = false;
    public static Boolean eyes8Check = false;

    public static Boolean mouth1Check = false;
    public static Boolean mouth2Check = false;
    public static Boolean mouth3Check = false;
    public static Boolean mouth4Check = false;
    public static Boolean mouth5Check = false;
    public static Boolean mouth6Check = false;

    public static Boolean outfit1Check = false;
    public static Boolean outfit2Check = false;
    public static Boolean outfit3Check = false;
    public static Boolean outfit4Check = false;
    public static Boolean outfit5Check = false;
    public static Boolean outfit6Check = false;
    public static Boolean outfit7Check = false;
    public static Boolean outfit8Check = false;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        backACheck = false;
        backBCheck = false;
        skin1Check = false;
        skin2Check = false;
        skin3Check = false;
        skin4Check = false;
        
        eyebrows1Check = false;
        eyebrows2Check = false;
        eyebrows3Check = false;
        eyebrows4Check = false;
        eyebrows5Check = false;
        eyebrows7Check = false;
        eyebrows6Check = false;
        eyebrows8Check = false;
       
        hair1Check = false;
        hair2Check = false;
        hair3Check = false;
        hair4Check = false;
        
        eyes1Check = false;
        eyes2Check = false;
        eyes3Check = false;
        eyes4Check = false;
        eyes5Check = false;
        eyes6Check = false;
        eyes7Check = false;
        eyes8Check = false;

        mouth1Check = false;
        mouth2Check = false;
        mouth3Check = false;
        mouth4Check = false;
        mouth5Check = false;
        mouth6Check = false;

        outfit1Check = false;
        outfit2Check = false;
        outfit3Check = false;
        outfit4Check = false;
        outfit5Check = false;
        outfit6Check = false;
        outfit7Check = false;
        outfit8Check = false;
        
        //hair hashmap
        hairMap.put(hair1aButton, hair1a);
        hairMap.put(hair1bButton, hair1b);
        hairMap.put(hair2aButton, hair2a);
        hairMap.put(hair2bButton, hair2b);
        hairMap.put(noHairButton, null);
        
        //eyebrows hashmap  
        eyebrowsMap.put(brow1Button, brow1);
        eyebrowsMap.put(brow2Button, brow2);
        eyebrowsMap.put(brow3Button, brow3);
        eyebrowsMap.put(brow4Button, brow4);
        eyebrowsMap.put(brow5Button, brow5);
        eyebrowsMap.put(brow6Button, brow6);
        eyebrowsMap.put(brow7Button, brow7);
        eyebrowsMap.put(brow8Button, brow8);

        //eyes hashmap
        eyesMap.put(eye1Button, eye1);
        eyesMap.put(eye2Button, eye2);
        eyesMap.put(eye3aButton, eye3a);
        eyesMap.put(eye3bButton, eye3b);
        eyesMap.put(eye4aButton, eye4a);
        eyesMap.put(eye4bButton, eye4b);
        eyesMap.put(eye5aButton, eye5a);
        eyesMap.put(eye5bButton, eye5b);
        
        //mouth hashmap
        mouthMap.put(mouth1Button, mouth1);
        mouthMap.put(mouth2Button, mouth2);
        mouthMap.put(mouth3Button, mouth3);
        mouthMap.put(mouth4Button, mouth4);
        mouthMap.put(mouth5Button, mouth5);
        mouthMap.put(mouth6Button, mouth6);

        //skin hashmap
        // skinMap.put(skin1Button, skin1);
        skinMap.put(skin2Button, skin2);
        skinMap.put(skin3Button, skin3);
        skinMap.put(skin4Button, skin4);

        //outfit hashmap
        outfitMap.put(outfit1Button, outfit1);
        outfitMap.put(outfit2Button, outfit2);
        outfitMap.put(outfit3Button, outfit3);
        outfitMap.put(outfit4Button, outfit4);
        outfitMap.put(outfit5Button, outfit5);
        outfitMap.put(outfit6Button, outfit6);
        outfitMap.put(outfit7Button, outfit7);
        outfitMap.put(outfit8Button, outfit8);
        
        //back hashmap
        backMap.put(backAButton, backA);
        backMap.put(backBButton, backB);

    }


    public void optionsCustom (ActionEvent event) throws IOException{

        hairGroup.setLayoutY(720);
        eyebrowsGroup.setLayoutY(720);
        eyesGroup.setLayoutY(1000);
        mouthGroup.setLayoutY(1000);
        skinGroup.setLayoutY(720);
        outfitGroup1.setLayoutY(1000);
        outfitGroup2.setLayoutY(1000);

        if (event.getSource() == optionHair) {
            hairGroup.setLayoutY(154);
        } 
        else if (event.getSource() == optionEyebrows) {
            eyebrowsGroup.setLayoutY(154);
        }
        else if (event.getSource() == optionEyes) {
            eyesGroup.setLayoutY(154);
        } 
        else if (event.getSource() == optionMouth) {
            mouthGroup.setLayoutY(154);
        } 
        else if (event.getSource() == optionSkin) {
            skinGroup.setLayoutY(154);
        } 
        else if (event.getSource() == optionOutfits) {
            outfitGroup1.setLayoutY(154);
        }
        else if (event.getSource() == next) {
            outfitGroup2.setLayoutY(154);
        }
        else if (event.getSource() == prev) {
            outfitGroup1.setLayoutY(154);
        }
    }

    public void hairChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;

        if (hairMap.containsKey(event.getSource())) {
            ImageView selectedHair = hairMap.get(event.getSource());
            double defaultLayoutY = 725;

            // Reset the layoutY for all hair image views
            for (ImageView hair : hairMap.values()) {
                if (hair != null) {
                    hair.setLayoutY(defaultLayoutY);
                    
                }
            }

            // Set the selected hair's layoutY
            if (selectedHair != null) {
                selectedHair.setLayoutY(165);
                
                if (selectedHair == hair1a) hair1Check = true;
                else if (selectedHair == hair1b) hair2Check = true;
                else if (selectedHair == hair2a) hair3Check = true;
                else if (selectedHair == hair2b) hair4Check = true;
            }
        }
    }

    public void eyebrowsChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;

        for (Button button : eyebrowsMap.keySet()) {
            ImageView eyebrow = eyebrowsMap.get(button);
            if (event.getSource() == button) {
                // Set the layoutY for the selected eyebrow ImageView
                eyebrow.setLayoutY(165.0);
                customSelected.add(eyebrow);

                if (eyebrow == brow1) eyebrows1Check = true;
                else if (eyebrow == brow2) eyebrows2Check = true;
                else if (eyebrow == brow3) eyebrows3Check = true;
                else if (eyebrow == brow4) eyebrows4Check = true;
                else if (eyebrow == brow5) eyebrows5Check = true;
                else if (eyebrow == brow6) eyebrows6Check = true;
                else if (eyebrow == brow7) eyebrows7Check = true;
                else if (eyebrow == brow8) eyebrows8Check = true;
            } 
            else {
                // Reset the layoutY for other eyebrow ImageViews
                eyebrow.setLayoutY(900.0);
                customSelected.remove(eyebrow);
            }
        }
    }  
    
    public void eyesChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;

        for (Button button : eyesMap.keySet()) {
            ImageView eyes = eyesMap.get(button);
            if (event.getSource() == button) {
                // Set the layoutY for the selected eyebrow ImageView
                eyes.setLayoutY(165.0);
                customSelected.add(eyes);

                if(eyes == eye1) eyes1Check = true;
                else if(eyes == eye2) eyes2Check = true;
                else if(eyes == eye3a) eyes3Check = true;
                else if(eyes == eye3b) eyes4Check = true;
                else if(eyes == eye4a) eyes5Check = true;
                else if(eyes == eye4b) eyes6Check = true;
                else if(eyes == eye5a) eyes7Check = true;
                else if(eyes == eye5b) eyes8Check = true;
                
            } 
            else {
                // Reset the layoutY for other eyebrow ImageViews
                eyes.setLayoutY(1000.0);
                customSelected.remove(eyes);
            }
        }
    }

    public void mouthChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;

        for (Button button : mouthMap.keySet()) {
            ImageView mouth = mouthMap.get(button);
            if (event.getSource() == button) {
                // Set the layoutY for the selected eyebrow ImageView
                mouth.setLayoutY(165.0);
                customSelected.add(mouth);

                if (mouth == mouth1) mouth1Check = true;
                else if (mouth == mouth2) mouth2Check = true;
                else if (mouth == mouth3) mouth3Check = true;
                else if (mouth == mouth4) mouth4Check = true;
                else if (mouth == mouth5) mouth5Check = true;
                else if (mouth == mouth6) mouth6Check = true;
            } 
            else {
                // Reset the layoutY for other eyebrow ImageViews
                mouth.setLayoutY(1200.0);
                customSelected.remove(mouth);
            }
        }
    }

    public void skinChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;

        for (Button button : skinMap.keySet()) {
            ImageView skin = skinMap.get(button);
            if (event.getSource() == button) {
                // Set the layoutY for the selected eyebrow ImageView
                skin.setLayoutY(165.0);
                customSelected.add(skin);

                if(skin == skin1) skin1Check = true;
                else if(skin == skin2) skin2Check = true;
                else if(skin == skin3) skin3Check = true;
                else if(skin == skin4) skin4Check = true;
            } 
            else {
                // Reset the layoutY for other eyebrow ImageViews
                skin.setLayoutY(1200.0);
                customSelected.remove(skin);
            }
        }
    }

    public void outfitChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;

        for (Button button : outfitMap.keySet()) {
            ImageView outfit = outfitMap.get(button);
            if (event.getSource() == button) {
                // Set the layoutY for the selected eyebrow ImageView
                outfit.setLayoutY(165.0);
                customSelected.add(outfit);

                if(outfit == outfit1) outfit1Check = true;
                else if(outfit == outfit2) outfit2Check = true;
                else if(outfit == outfit3) outfit3Check = true;
                else if(outfit == outfit4) outfit4Check = true;
                else if(outfit == outfit5) outfit5Check = true;
                else if(outfit == outfit6) outfit6Check = true;
                else if(outfit == outfit7) outfit7Check = true;
                else if(outfit == outfit8) outfit8Check = true;
            } 
            else {
                // Reset the layoutY for other eyebrow ImageViews
                outfit.setLayoutY(1300.0);
                customSelected.remove(outfit);
            }
        }
    }

    public void backChoose(ActionEvent event) throws IOException{
        
        filodroidCustomCheck = true;
        
        for (Button button : backMap.keySet()) {
            ImageView back = backMap.get(button);
            if (event.getSource() == button) {
                // Set the layoutY for the selected eyebrow ImageView
                back.setLayoutY(165.0);
                customSelected.add(back);

                if(back == backA) backACheck = true;
                else if(back == backB) backBCheck = true;

            } 
            else {
                // Reset the layoutY for other eyebrow ImageViews
                back.setLayoutY(1300.0);
                customSelected.remove(back);
            }
        }
    }

    public void resetAllToDefault(ActionEvent event) throws IOException {
        
        double defaultLayoutY = 725.0; // Set your default layoutY value here
    
        for (ImageView hair : hairMap.values()) {
            if (hair != null) {
                hair.setLayoutY(defaultLayoutY);
            }
        }
    
        for (ImageView eyebrow : eyebrowsMap.values()) {
            eyebrow.setLayoutY(defaultLayoutY);
        }
    
        for (ImageView eyes : eyesMap.values()) {
            eyes.setLayoutY(defaultLayoutY);
        }
    
        for (ImageView mouth : mouthMap.values()) {
            mouth.setLayoutY(defaultLayoutY);
        }

        for (ImageView skin : skinMap.values()) {             
            skin.setLayoutY(defaultLayoutY);
        }

        for (ImageView outfit : outfitMap.values()) {
            outfit.setLayoutY(defaultLayoutY);
        }

        for (ImageView back : backMap.values()) {
            back.setLayoutY(defaultLayoutY);
        }

        filodroidCustomCheck = false;
        customSelected.clear();
    }


    public void checkOutCustom(ActionEvent event) throws IOException {

        filodroidCustomName = filodroidNameField.getText();
        product9.setProductName(filodroidCustomName);

        System.out.println(customSelected);

        if (filodroidCustomName.equals("") || filodroidCustomCheck == false) {
            AlertMaker.showErrorAlert("Customization", "Customize first and put a name on it before checking out.");    
        }

        else if (filodroidCustomName.isEmpty() == false) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/Products.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }    

    }

    public void customizeGoBack(ActionEvent event) throws IOException {

        backACheck = false;
        backBCheck = false;
        skin1Check = false;
        skin2Check = false;
        skin3Check = false;
        skin4Check = false;
        
        eyebrows1Check = false;
        eyebrows2Check = false;
        eyebrows3Check = false;
        eyebrows4Check = false;
        eyebrows5Check = false;
        eyebrows7Check = false;
        eyebrows6Check = false;
        eyebrows8Check = false;
    
        hair1Check = false;
        hair2Check = false;
        hair3Check = false;
        hair4Check = false;
        
        eyes1Check = false;
        eyes2Check = false;
        eyes3Check = false;
        eyes4Check = false;
        eyes5Check = false;
        eyes6Check = false;
        eyes7Check = false;
        eyes8Check = false;

        mouth1Check = false;
        mouth2Check = false;
        mouth3Check = false;
        mouth4Check = false;
        mouth5Check = false;
        mouth6Check = false;

        outfit1Check = false;
        outfit2Check = false;
        outfit3Check = false;
        outfit4Check = false;
        outfit5Check = false;
        outfit6Check = false;
        outfit7Check = false;
        outfit8Check = false;

        if (customizeGoBackCount == 1) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }

        else if (customizeGoBackCount == 2) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Products/Products.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }
    }

    public void gotoUserProfile(ActionEvent event) throws IOException {
        
        SettingsController.settingsGoBackCount = 4;

        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    public void showInstruct(ActionEvent event) throws IOException { 
        AlertMaker.showInstructionsAlert("MABUHAY! :D", "Filodroids Company is a local Filipino company that manufactures and sells hobby products such as \nfigures. We handle everything from designing and making the products to marketing and distributing \nthem. Our unique creations are inspired by different generations of Filipino themes and culture.");

    }

    public void showAbout(ActionEvent event) throws IOException { 
        AlertMaker.showAboutAlert("About us", 
        
        "DANNY DANNY - FILODROIDS \nAgustin, Sherlene \nAngeles, Jason \nBabao, Lark \nValdez, Angelique");

    }
   
}
 
