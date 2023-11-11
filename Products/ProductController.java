package Products;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import Home.HomeController;
import Products.model.Cart;
import Products.model.p1;
import Products.model.p2;
import Products.model.p3;
import Products.model.p4;
import Products.model.p5;
import Products.model.p6;
import Products.model.p7;
import Products.model.p8;
import Products.model.p9;
import Receipt.ReceiptController;
import Settings.SettingsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductController implements Initializable {
    @FXML
    private Label item1;
    
    @FXML
    private Label item2;

    @FXML
    private Label item3;
    
    @FXML
    private Label item4;
    
    @FXML
    private Label item5;
    
    @FXML
    private Label item6;

    @FXML
    private Label item7;
    
    @FXML
    private Label item8;

    @FXML
    private Label item9;

    @FXML
    private Label price1; 

    @FXML
    private Label price2; 

    @FXML
    private Label price3;

    @FXML
    private Label price4;
    
    @FXML
    private Label price5;
    
    @FXML
    private Label price6;
    
    @FXML
    private Label price7; 

    @FXML
    private Label price8;
    
    @FXML
    private Label price9;
    
    @FXML
    public ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML
    public ImageView backAModel, backBModel;

    @FXML
    public ImageView skin1Model, skin2Model, skin3Model, skin4Model;

    @FXML
    public ImageView eyebrows1Model, eyebrows2Model, eyebrows3Model, eyebrows4Model, eyebrows5Model, eyebrows6Model, eyebrows7Model, eyebrows8Model;

    @FXML
    public ImageView hair1Model, hair2Model, hair3Model, hair4Model;

    @FXML
    public ImageView eyes1Model, eyes2Model, eyes3Model, eyes4Model, eyes5Model, eyes6Model, eyes7Model, eyes8Model;

    @FXML
    public ImageView mouth1Model, mouth2Model, mouth3Model, mouth4Model, mouth5Model, mouth6Model;

    @FXML
    public ImageView outfit1Model, outfit2Model, outfit3Model, outfit4Model, outfit5Model, outfit6Model, outfit7Model, outfit8Model;

    @FXML
    private Button p1;

    @FXML
    private Button p2;
    
    @FXML
    private Button p3; 
    
    @FXML
    private Button p4;
    
    @FXML
    private Button p5;
    
    @FXML
    private Button p6;
    
    @FXML
    private Button p7;
    
    @FXML
    private Button p8;
    
    @FXML
    private Button p9;

    @FXML
    private Button v1, v2, v3, v4, v5, v6, v7, v8, v9;

    @FXML
    static Parent homeRoot = null;


    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static
    CartController cartController = null;

    @FXML
    static
    ReceiptController receiptController = null;


    @FXML
    private ListView<String> cartListView;


    FXMLLoader loader;

    public static int count = 0;

    public static p1 product1 = new p1();
    public static p2 product2 = new p2();
    public static p3 product3 = new p3();
    public static p4 product4 = new p4();
    public static p5 product5 = new p5();
    public static p6 product6 = new p6();
    public static p7 product7 = new p7();
    public static p8 product8 = new p8();
    public static p9 product9 = new p9();
    public static Cart cart = new Cart();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        item1.setText(HomeController.product1.getProductName());
        price1.setText("₱ " + Double.toString(HomeController.product1.getProductPrice()));
        Image image1 = new Image(HomeController.product1.getProductImage());
        img1.setImage(image1);

        // ============== ITEM 2 ==================//
        item2.setText(HomeController.product2.getProductName());
        price2.setText("₱ " + Double.toString(HomeController.product2.getProductPrice()));
        Image image2 = new Image(HomeController.product2.getProductImage());
        img2.setImage(image2);           

        // ============== ITEM 3 ==================//
        item3.setText(HomeController.product3.getProductName());
        price3.setText("₱ " + Double.toString(HomeController.product3.getProductPrice()));
        Image image3 = new Image(HomeController.product3.getProductImage());
        img3.setImage(image3);

        // ============== ITEM 4 ==================//
        item4.setText(HomeController.product4.getProductName());
        price4.setText("₱ " + Double.toString(HomeController.product4.getProductPrice()));
        Image image4 = new Image(HomeController.product4.getProductImage());
        img4.setImage(image4);

        // ============== ITEM 5 ==================//
        item5.setText(HomeController.product5.getProductName());
        price5.setText("₱ " + Double.toString(HomeController.product5.getProductPrice()));
        Image image5 = new Image(HomeController.product5.getProductImage());
        img5.setImage(image5);

        // ============== ITEM 6 ==================//
        item6.setText(HomeController.product6.getProductName());
        price6.setText("₱ " + Double.toString(HomeController.product6.getProductPrice()));
        Image image6 = new Image(HomeController.product6.getProductImage());
        img6.setImage(image6);

        // ============== ITEM 7 ==================//
        item7.setText(HomeController.product7.getProductName());
        price7.setText("₱ " + Double.toString(HomeController.product7.getProductPrice()));
        Image image7 = new Image(HomeController.product7.getProductImage());
        img7.setImage(image7);

        // ============== ITEM 8 ==================//
        item8.setText(HomeController.product8.getProductName());
        price8.setText("₱ " + Double.toString(HomeController.product8.getProductPrice()));
        Image image8 = new Image(HomeController.product8.getProductImage());
        img8.setImage(image8);

        // ============== ITEM 9 ==================//
        if(CustomizeController.product9.getProductName() == null) item9.setText("Custom ()");
        else{
            item9.setText("Custom (" + CustomizeController.product9.getProductName() + ")");
        } 
        price9.setText("₱ " + Double.toString(HomeController.product9.getProductPrice()));
        Image image9 = new Image(HomeController.product9.getProductImage());
        skin1Model.setImage(image9);

        try {
            loader = new FXMLLoader(getClass().getResource("/Products/Cart.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
 
        }

        // Clears all items in Checkout.fxml
        cartController = loader.getController();
        cartController.myVBox.getChildren().removeAll(ProductController.cartController.myVBox.getChildren());
        
        displayModel();
    }


    public void displayModel(){

        int visibleVal = 399;
        
        if (CustomizeController.backACheck) backAModel.setLayoutY(visibleVal);
        else if (CustomizeController.backBCheck) backBModel.setLayoutY(visibleVal);

        if (CustomizeController.skin1Check) skin1Model.setLayoutY(visibleVal);
        else if (CustomizeController.skin2Check) skin2Model.setLayoutY(visibleVal);
        else if (CustomizeController.skin3Check) skin3Model.setLayoutY(visibleVal);
        else if (CustomizeController.skin4Check) skin4Model.setLayoutY(visibleVal);

        if (CustomizeController.eyebrows1Check) eyebrows1Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows2Check) eyebrows2Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows3Check) eyebrows3Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows4Check) eyebrows4Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows5Check) eyebrows5Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows6Check) eyebrows6Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows7Check) eyebrows7Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyebrows8Check) eyebrows8Model.setLayoutY(visibleVal);

        if (CustomizeController.hair1Check) hair1Model.setLayoutY(visibleVal);
        else if (CustomizeController.hair2Check) hair2Model.setLayoutY(visibleVal);
        else if (CustomizeController.hair3Check) hair3Model.setLayoutY(visibleVal);
        else if (CustomizeController.hair4Check) hair4Model.setLayoutY(visibleVal);

        if (CustomizeController.eyes1Check) eyes1Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes2Check) eyes2Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes3Check) eyes3Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes4Check) eyes4Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes5Check) eyes5Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes6Check) eyes6Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes7Check) eyes7Model.setLayoutY(visibleVal);
        else if (CustomizeController.eyes8Check) eyes8Model.setLayoutY(visibleVal);
        
        if (CustomizeController.mouth1Check) mouth1Model.setLayoutY(visibleVal);
        else if (CustomizeController.mouth2Check) mouth2Model.setLayoutY(visibleVal);
        else if (CustomizeController.mouth3Check) mouth3Model.setLayoutY(visibleVal);
        else if (CustomizeController.mouth4Check) mouth4Model.setLayoutY(visibleVal);
        else if (CustomizeController.mouth5Check) mouth5Model.setLayoutY(visibleVal);
        else if (CustomizeController.mouth6Check) mouth6Model.setLayoutY(visibleVal);

        if (CustomizeController.outfit1Check) outfit1Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit2Check) outfit2Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit3Check) outfit3Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit4Check) outfit4Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit5Check) outfit5Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit6Check) outfit6Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit7Check) outfit7Model.setLayoutY(visibleVal);
        else if (CustomizeController.outfit8Check) outfit8Model.setLayoutY(visibleVal);
    }

    public void buy(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();

     // If addtocart button is pressed, set product status to true
        if (sourceButton == p1) {
            if (HomeController.product1.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product1.getProductName() +" has been added on your cart. :D");
                if (HomeController.product1.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane1, product1); 
                    HomeController.product1.setProductStatus(true);
                }     
                HomeController.product1.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product1.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p2) {
            if (HomeController.product2.getProductQuantity() < 1) {
            AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product2.getProductName() +" has been added on your cart. :D");
                if (HomeController.product2.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane2, product2); 
                    HomeController.product2.setProductStatus(true);
                }   
                HomeController.product2.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product2.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p3) {
            if (HomeController.product3.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product3.getProductName() +" has been added on your cart. :D");
                if (HomeController.product3.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane3, product3); 
                    HomeController.product3.setProductStatus(true);
                }   
                HomeController.product3.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product3.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p4) {
            if (HomeController.product4.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product4.getProductName() +" has been added on your cart. :D");
                if (HomeController.product4.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane4, product4); 
                    HomeController.product4.setProductStatus(true);
                }   
                HomeController.product4.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product4.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p5) {
            if (HomeController.product5.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product5.getProductName() +" has been added on your cart. :D");
                if (HomeController.product5.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane5, product5); 
                    HomeController.product5.setProductStatus(true);
                }   
                HomeController.product5.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product5.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p6) {
            if (HomeController.product6.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product6.getProductName() +" has been added on your cart. :D");
                if (HomeController.product6.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane6, product6); 
                    HomeController.product6.setProductStatus(true);
                }   
                HomeController.product6.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product6.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p7) {
            if (HomeController.product7.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product7.getProductName() +" has been added on your cart. :D");
                if (HomeController.product7.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane7, product7); 
                    HomeController.product7.setProductStatus(true);
                }   
                HomeController.product7.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product7.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p8) {
            if (HomeController.product8.getProductQuantity() < 1) {
                AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + HomeController.product8.getProductName() +" has been added on your cart. :D");
                if (HomeController.product8.getProductStatus() == false) {
                    ProductController.cart.addPaneItem(ProductController.cartController.pane8, product8); 
                    HomeController.product8.setProductStatus(true);
                }   
                HomeController.product8.addProductQuantity(1);
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", HomeController.product8.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }

        else if (sourceButton == p9) {
            if (HomeController.product9.getProductQuantity() < 1) {
                if(CustomizeController.filodroidCustomCheck == false) {
                    AlertMaker.showErrorAlert("Check Out", "You cannot check out this product, you have to customize first.");  
                } else {
                    AlertMaker.showSimpleAlert("Mabuhay!", "FiloDroid " + CustomizeController.product9.getProductName() +" has been added on your cart. :D");
                    if (HomeController.product9.getProductStatus() == false) {
                        ProductController.cart.addPaneItem(ProductController.cartController.pane9, product9); 
                        HomeController.product9.setProductStatus(true);
                    }
                    HomeController.product9.addProductQuantity(1);
                }  
            } else {
                AlertMaker.showSimpleAlert("Mabuhay!", CustomizeController.product9.getProductName() + " is already added to cart! Please adjust the quantity at the cart :<");
            }
        }
        
        ProductController.cart.showItems();
    }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        SettingsController.settingsGoBackCount = 2;
        
        CartController.cartGoBackCount = 2;

        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        SettingsController.changeDetailsCount = 2;
        
    }

    // Goes to Checkout.fxml
    public void gotoCheckout(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Checkout/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
     
    }

    // Goes to Home.fxml
    public void gotoHome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Home/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void gotoCart(ActionEvent event) throws IOException {
        if (AlertMaker.showConfirmationAlert("Warning", "Cannot go back to product selection after. Are you sure you want to want to continue to cart?") == true){
            SettingsController.settingsGoBackCount = 2;      
            CartController.cartGoBackCount = 2;

            ProductController.cartController.showItems(ProductController.cart.getItemList());
            ProductController.cartController.getInitialAmount();
            
            Scene scene = new Scene(ProductController.homeRoot);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        };
    }

    public void gotoCustomize(ActionEvent event) throws IOException {

        CartController.cartGoBackCount = 2;
        CustomizeController.customizeGoBackCount = 2;

        Parent root = FXMLLoader.load(getClass().getResource("Customize.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    public void view (ActionEvent event) throws IOException {

        Button viewButton = (Button) event.getSource();
        CartController.cartGoBackCount = 2;


         if (viewButton.equals(v1)) {
            
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View1.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v2) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View2.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v3) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View3.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v4) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View4.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v5) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View5.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

         else if (viewButton == v6) { 
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View6.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v7) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View7.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton== v8) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View8.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

    }  
    
    
    public void showInstruct(ActionEvent event) throws IOException { 
        AlertMaker.showInstructionsAlert("MABUHAY! :D", "Filodroids Company is a local Filipino company that manufactures and sells hobby products such as \nfigures. We handle everything from designing and making the products to marketing and distributing \nthem. Our unique creations are inspired by different generations of Filipino themes and culture.");
        
    }
   
    public void showAbout(ActionEvent event) throws IOException { 
        AlertMaker.showAboutAlert("About us",
        "DANNY DANNY - FILODROIDS \nAgustin, Sherlene \nAngeles, Jason \nBabao, Lark \nValdez, Angelique");
   
    }
    
}