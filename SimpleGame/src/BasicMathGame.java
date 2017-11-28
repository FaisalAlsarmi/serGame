import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class BasicMathGame extends Application {

   private int live  = 3;
   private int score = 0;
   final Label message = new Label("");
  private StackPane stackPane;
  private String[] ans = {"","9","5","0","1","3","15","30","10","90","50","222","30","100","4","5","1132","312","625","9","71","30","-14","8","4","16"};
  @Override
  public void start(Stage stage) {
    Group root = new Group();
    Scene scene = new Scene(root,1366,768);
    stage.setScene(scene);
    stage.setTitle("Basic Maths Game for Kids");
    stackPane = new StackPane();
     final ImageView game = new ImageView();
     final Image image = new Image(BasicMathGame.class.getResourceAsStream("kidsMaths.png"));
     game.setImage(image);
     final HBox pictureRegion = new HBox();
     pictureRegion.getChildren().add(game);
     
     final ImageView game1 = new ImageView();
     final Image image1 = new Image(BasicMathGame.class.getResourceAsStream("a1.png"));
     game1.setImage(image1);
     final HBox pictureRegion1 = new HBox();
     pictureRegion1.getChildren().add(game1);
     pictureRegion1.setVisible(false);
     
     
     
     final ImageView game2 = new ImageView();
     final Image image2 = new Image(BasicMathGame.class.getResourceAsStream("a2.png"));
     game2.setImage(image2);
     final HBox pictureRegion2 = new HBox();
     pictureRegion2.getChildren().add(game2);
     pictureRegion2.setVisible(false);
     
      final ImageView game3 = new ImageView();
     final Image image3 = new Image(BasicMathGame.class.getResourceAsStream("a3.png"));
     game3.setImage(image3);
     final HBox pictureRegion3 = new HBox();
     pictureRegion3.getChildren().add(game3);
     pictureRegion3.setVisible(false);
     
      final ImageView game4 = new ImageView();
     final Image image4 = new Image(BasicMathGame.class.getResourceAsStream("a4.png"));
     game4.setImage(image4);
     final HBox pictureRegion4 = new HBox();
     pictureRegion4.getChildren().add(game4);
     pictureRegion4.setVisible(false);
     
      final ImageView game5 = new ImageView();
     final Image image5 = new Image(BasicMathGame.class.getResourceAsStream("a5.png"));
     game5.setImage(image5);
     final HBox pictureRegion5 = new HBox();
     pictureRegion5.getChildren().add(game5);
     pictureRegion5.setVisible(false);
     
      final ImageView game6 = new ImageView();
     final Image image6 = new Image(BasicMathGame.class.getResourceAsStream("a6.png"));
     game6.setImage(image6);
     final HBox pictureRegion6 = new HBox(); 
     pictureRegion6.getChildren().add(game6);
     pictureRegion6.setVisible(false);
     
      final ImageView game7 = new ImageView();
     final Image image7 = new Image(BasicMathGame.class.getResourceAsStream("a7.png"));
     game7.setImage(image7);
     final HBox pictureRegion7 = new HBox();
     pictureRegion7.getChildren().add(game7);
     pictureRegion7.setVisible(false);
     
      final ImageView game8 = new ImageView();
     final Image image8 = new Image(BasicMathGame.class.getResourceAsStream("a8.png"));
     game8.setImage(image8);
     final HBox pictureRegion8 = new HBox();
     pictureRegion8.getChildren().add(game8);
     pictureRegion8.setVisible(false);
     
      final ImageView game9 = new ImageView();
     final Image image9 = new Image(BasicMathGame.class.getResourceAsStream("a9.png"));
     game9.setImage(image9);
     final HBox pictureRegion9 = new HBox();
     pictureRegion9.getChildren().add(game9);
     pictureRegion9.setVisible(false);
     
      final ImageView game10 = new ImageView();
     final Image image10 = new Image(BasicMathGame.class.getResourceAsStream("a10.png"));
     game10.setImage(image10);
     final HBox pictureRegion10 = new HBox();
     pictureRegion10.getChildren().add(game10);
     pictureRegion10.setVisible(false);
     
      final ImageView game11 = new ImageView();
     final Image image11 = new Image(BasicMathGame.class.getResourceAsStream("a11.png"));
     game11.setImage(image11);
     final HBox pictureRegion11 = new HBox();
     pictureRegion11.getChildren().add(game11);
     pictureRegion11.setVisible(false);
     
      final ImageView game12 = new ImageView();
     final Image image12 = new Image(BasicMathGame.class.getResourceAsStream("a12.png"));
     game12.setImage(image12);
     final HBox pictureRegion12 = new HBox();
     pictureRegion12.getChildren().add(game12);
     pictureRegion12.setVisible(false);
     
      final ImageView game13 = new ImageView();
     final Image image13 = new Image(BasicMathGame.class.getResourceAsStream("a13.png"));
     game13.setImage(image13);
     final HBox pictureRegion13 = new HBox();
     pictureRegion13.getChildren().add(game13);
     pictureRegion13.setVisible(false);
     
      final ImageView game14 = new ImageView();
     final Image image14 = new Image(BasicMathGame.class.getResourceAsStream("a14.png"));
     game14.setImage(image14);
     final HBox pictureRegion14 = new HBox();
     pictureRegion14.getChildren().add(game14);
     pictureRegion14.setVisible(false);
     
      final ImageView game15 = new ImageView();
     final Image image15 = new Image(BasicMathGame.class.getResourceAsStream("a15.png"));
     game15.setImage(image15);
     final HBox pictureRegion15 = new HBox();
     pictureRegion15.getChildren().add(game15);
     pictureRegion15.setVisible(false);
     
      final ImageView game16 = new ImageView();
     final Image image16 = new Image(BasicMathGame.class.getResourceAsStream("a16.png"));
     game16.setImage(image16);
     final HBox pictureRegion16 = new HBox();
     pictureRegion16.getChildren().add(game16);
     pictureRegion16.setVisible(false);
     
      final ImageView game17 = new ImageView();
     final Image image17 = new Image(BasicMathGame.class.getResourceAsStream("a17.png"));
     game17.setImage(image17);
     final HBox pictureRegion17 = new HBox();
     pictureRegion17.getChildren().add(game17);
     pictureRegion17.setVisible(false);
     
      final ImageView game18 = new ImageView();
     final Image image18 = new Image(BasicMathGame.class.getResourceAsStream("a18.png"));
     game18.setImage(image18);
     final HBox pictureRegion18 = new HBox();
     pictureRegion18.getChildren().add(game18);
     pictureRegion18.setVisible(false);
     
      final ImageView game19 = new ImageView();
     final Image image19 = new Image(BasicMathGame.class.getResourceAsStream("a19.png"));
     game19.setImage(image19);
     final HBox pictureRegion19 = new HBox();
     pictureRegion19.getChildren().add(game19);
     pictureRegion19.setVisible(false);
     
      final ImageView game20 = new ImageView();
     final Image image20 = new Image(BasicMathGame.class.getResourceAsStream("a20.png"));
     game20.setImage(image20);
     final HBox pictureRegion20 = new HBox();
     pictureRegion20.getChildren().add(game20);
     pictureRegion20.setVisible(false);
     
      final ImageView game21 = new ImageView();
     final Image image21 = new Image(BasicMathGame.class.getResourceAsStream("a21.png"));
     game21.setImage(image21);
     final HBox pictureRegion21 = new HBox();
     pictureRegion21.getChildren().add(game21);
     pictureRegion21.setVisible(false);
     
      final ImageView game22 = new ImageView();
     final Image image22 = new Image(BasicMathGame.class.getResourceAsStream("a22.png"));
     game22.setImage(image22);
     final HBox pictureRegion22 = new HBox();
     pictureRegion22.getChildren().add(game22);
     pictureRegion22.setVisible(false);
     
      final ImageView game23 = new ImageView();
     final Image image23 = new Image(BasicMathGame.class.getResourceAsStream("a23.png"));
     game23.setImage(image23);
     final HBox pictureRegion23 = new HBox();
     pictureRegion23.getChildren().add(game23);
     pictureRegion23.setVisible(false);
     
      final ImageView game24 = new ImageView();
     final Image image24 = new Image(BasicMathGame.class.getResourceAsStream("a24.png"));
     game24.setImage(image24);
     final HBox pictureRegion24 = new HBox();
     pictureRegion24.getChildren().add(game24);
     pictureRegion24.setVisible(false);
     
      final ImageView game25 = new ImageView();
     final Image image25 = new Image(BasicMathGame.class.getResourceAsStream("a25.png"));
     game25.setImage(image25);
     final HBox pictureRegion25 = new HBox();
     pictureRegion25.getChildren().add(game25);
     pictureRegion25.setVisible(false);
     
     
     
    
    
    Button level1 = new Button();
    level1.setText("Level 1");
    level1.setVisible(false);
    Button level2 = new Button();
    level2.setText("Level 2");
    level2.setVisible(false);
    Button level3 = new Button();
    level3.setText("Level 3");
    level3.setVisible(false);
    Button level4 = new Button();
    level4.setText("Level 4");
    level4.setVisible(false);
    Button level5 = new Button();
    level5.setText("Level 5");
    level5.setVisible(false);
    
    
    Label label1 = new Label("Name");
    final TextField name = new TextField();
    label1.setVisible(false);
    name.setVisible(false);
    Label label2 = new Label("Password");
    label2.setVisible(false);
    final PasswordField pb = new PasswordField();
    pb.setVisible(false);
    Button login = new Button();
    login.setText("Login");
    Button logout = new Button();
    logout.setText("Logout");
    logout.setVisible(false);
    Button exit = new Button();
    Button register = new Button();
    register.setText("Submit");
    register.setVisible(false);
    exit.setText("Exit");
     exit.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
         System.exit(0);
        }
      });
     
    Label question1 = new Label("Question 1");
    Label answer1 = new Label("Answer 1");
    Button submitAnswer1 = new Button("Next Question");
    final TextField field1 = new TextField();
    question1.setVisible(false);
    answer1.setVisible(false);
    field1.setVisible(false);
    submitAnswer1.setVisible(false);
    
    Label question2 = new Label("Question 2");
    Label answer2 = new Label("Answer 2");
    Button submitAnswer2 = new Button("Next Question");
    final TextField field2 = new TextField();
    question2.setVisible(false);
    answer2.setVisible(false);
    field2.setVisible(false);
    submitAnswer2.setVisible(false);
    
    Label question3 = new Label("Question 3");
    Label answer3 = new Label("Answer 3");
    Button submitAnswer3 = new Button("Next Question");
    final TextField field3 = new TextField();
    question3.setVisible(false);
    answer3.setVisible(false);
    field3.setVisible(false);
    submitAnswer3.setVisible(false);
    
    Label question4 = new Label("Question 4");
    Label answer4 = new Label("Answer 4");
    Button submitAnswer4 = new Button("Next Question");
    final TextField field4 = new TextField();
    question4.setVisible(false);
    answer4.setVisible(false);
    field4.setVisible(false);
    submitAnswer4.setVisible(false);
    
    Label question5 = new Label("Question 5");
    Label answer5 = new Label("Answer 5");
    Button submitAnswer5 = new Button("Next Question");
    final TextField field5 = new TextField();
    question5.setVisible(false);
    answer5.setVisible(false);
    field5.setVisible(false);
    submitAnswer5.setVisible(false);
    
    Label question6 = new Label("Question 6");
    Label answer6 = new Label("Answer 6");
    Button submitAnswer6 = new Button("Next Question");
    final TextField field6 = new TextField();
    question6.setVisible(false);
    answer6.setVisible(false);
    field6.setVisible(false);
    submitAnswer6.setVisible(false);
    
    Label question7 = new Label("Question 7");
    Label answer7 = new Label("Answer 7");
    Button submitAnswer7 = new Button("Next Question");
    final TextField field7 = new TextField();
    question7.setVisible(false);
    answer7.setVisible(false);
    field7.setVisible(false);
    submitAnswer7.setVisible(false);
    
    Label question8 = new Label("Question 8");
    Label answer8 = new Label("Answer 8");
    Button submitAnswer8 = new Button("Next Question");
    final TextField field8 = new TextField();
    question8.setVisible(false);
    answer8.setVisible(false);
    field8.setVisible(false);
    submitAnswer8.setVisible(false);
    
    Label question9 = new Label("Question 9");
    Label answer9 = new Label("Answer 9");
    Button submitAnswer9 = new Button("Next Question");
    final TextField field9 = new TextField();
    question9.setVisible(false);
    answer9.setVisible(false);
    field9.setVisible(false);
    submitAnswer9.setVisible(false);
    
    Label question10 = new Label("Question 10");
    Label answer10 = new Label("Answer 10");
    Button submitAnswer10 = new Button("Next Question");
    final TextField field10 = new TextField();
    question10.setVisible(false);
    answer10.setVisible(false);
    field10.setVisible(false);
    submitAnswer10.setVisible(false);
    
    Label question11 = new Label("Question 11");
    Label answer11 = new Label("Answer 11");
    Button submitAnswer11 = new Button("Next Question");
    final TextField field11 = new TextField();
    question11.setVisible(false);
    answer11.setVisible(false);
    field11.setVisible(false);
    submitAnswer11.setVisible(false);
    
    
    Label question12 = new Label("Question 12");
    Label answer12 = new Label("Answer 12");
    Button submitAnswer12 = new Button("Next Question");
    final TextField field12 = new TextField();
    question12.setVisible(false);
    answer12.setVisible(false);
    field12.setVisible(false);
    submitAnswer12.setVisible(false);
    
    Label question13 = new Label("Question 13");
    Label answer13 = new Label("Answer 13");
    Button submitAnswer13 = new Button("Next Question");
    final TextField field13 = new TextField();
    question13.setVisible(false);
    answer13.setVisible(false);
    field13.setVisible(false);
    submitAnswer13.setVisible(false);
    
    Label question14 = new Label("Question 14");
    Label answer14 = new Label("Answer 14");
    Button submitAnswer14 = new Button("Next Question");
    final TextField field14 = new TextField();
    question14.setVisible(false);
    answer14.setVisible(false);
    field14.setVisible(false);
    submitAnswer14.setVisible(false);
    
    Label question15 = new Label("Question 15");
    Label answer15 = new Label("Answer 15");
    Button submitAnswer15 = new Button("Next Question");
    final TextField field15 = new TextField();
    question15.setVisible(false);
    answer15.setVisible(false);
    field15.setVisible(false);
    submitAnswer15.setVisible(false);
    
    Label question16 = new Label("Question 16");
    Label answer16 = new Label("Answer 16");
    Button submitAnswer16 = new Button("Next Question");
    final TextField field16 = new TextField();
    question16.setVisible(false);
    answer16.setVisible(false);
    field16.setVisible(false);
    submitAnswer16.setVisible(false);
    
    Label question17 = new Label("Question 17");
    Label answer17 = new Label("Answer 17");
    Button submitAnswer17 = new Button("Next Question");
    final TextField field17 = new TextField();
    question17.setVisible(false);
    answer17.setVisible(false);
    field17.setVisible(false);
    submitAnswer17.setVisible(false);
    
    Label question18 = new Label("Question 18");
    Label answer18 = new Label("Answer 18");
    Button submitAnswer18 = new Button("Next Question");
    final TextField field18 = new TextField();
    question18.setVisible(false);
    answer18.setVisible(false);
    field18.setVisible(false);
    submitAnswer18.setVisible(false);
    
    Label question19 = new Label("Question 19");
    Label answer19 = new Label("Answer 19");
    Button submitAnswer19 = new Button("Next Question");
    final TextField field19 = new TextField();
    question19.setVisible(false);
    answer19.setVisible(false);
    field19.setVisible(false);
    submitAnswer19.setVisible(false);
    
    Label question20 = new Label("Question 20");
    Label answer20 = new Label("Answer 20");
    Button submitAnswer20 = new Button("Next Question");
    final TextField field20 = new TextField();
    question20.setVisible(false);
    answer20.setVisible(false);
    field20.setVisible(false);
    submitAnswer20.setVisible(false);
    
    Label question21 = new Label("Question 21");
    Label answer21 = new Label("Answer 21");
    Button submitAnswer21 = new Button("Next Question");
    final TextField field21 = new TextField();
    question21.setVisible(false);
    answer21.setVisible(false);
    field21.setVisible(false);
    submitAnswer21.setVisible(false);
    
    Label question22 = new Label("Question 22");
    Label answer22 = new Label("Answer 22");
    Button submitAnswer22 = new Button("Next Question");
    final TextField field22 = new TextField();
    question22.setVisible(false);
    answer22.setVisible(false);
    field22.setVisible(false);
    submitAnswer22.setVisible(false);
    
    Label question23 = new Label("Question 23");
    Label answer23 = new Label("Answer 23");
    Button submitAnswer23 = new Button("Next Question");
    final TextField field23 = new TextField();
    question23.setVisible(false);
    answer23.setVisible(false);
    field23.setVisible(false);
    submitAnswer23.setVisible(false);
    
    Label question24 = new Label("Question 24");
    Label answer24 = new Label("Answer 24");
    Button submitAnswer24 = new Button("Next Question");
    final TextField field24 = new TextField();
    question24.setVisible(false);
    answer24.setVisible(false);
    field24.setVisible(false);
    submitAnswer24.setVisible(false);
    
    Label question25 = new Label("Question 25");
    Label answer25 = new Label("Answer 25");
    Button submitAnswer25 = new Button("Submit");
    final TextField field25 = new TextField();
    question25.setVisible(false);
    answer25.setVisible(false);
    field25.setVisible(false);
    submitAnswer25.setVisible(false);
    
    
     
     
     login.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          label1.setVisible(true);
          label2.setVisible(true);
          name.setVisible(true);
          name.setText("");
          pb.setVisible(true);
          pb.setText("");
          register.setVisible(true);
          logout.setVisible(false);
           
        }
      });
     
     
     register.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        if (pb.getText().equals(name.getText())) {
          message.setText("Start Game");
          message.setTextFill(Color.web("red"));
          level1.setVisible(true);
          label1.setVisible(false);
          label2.setVisible(false);
          name.setVisible(false);
          pb.setVisible(false);
          register.setVisible(false);
          login.setVisible(false);
          logout.setVisible(false);
         } else {
          message.setText("Your password is incorrect!");
          message.setTextFill(Color.web("black"));
        }
        pb.setText("");
      
      }
    });
     
    logout.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
             level1.setVisible(false);
             level2.setVisible(false);
             level3.setVisible(false);
             level4.setVisible(false);
             level5.setVisible(false);
             label1.setVisible(false);
            label2.setVisible(false);
          name.setVisible(false);
          pb.setVisible(false);
          register.setVisible(false);
          login.setVisible(true);
          logout.setVisible(false);
             message.setVisible(false);
        }
      }); 
    
    
    VBox vb = new VBox();
    vb.setPadding(new Insets(10, 0, 0, 10));
    vb.setSpacing(20);
    
    
    HBox printImage = new HBox();
    printImage.setSpacing(40);
    printImage.setAlignment(Pos.CENTER_LEFT);
      
    
    
     level1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            printImage.getChildren().addAll(question1,pictureRegion1,answer1,field1,submitAnswer1);
            pictureRegion1.setVisible(true);
            question1.setVisible(true);
            answer1.setVisible(true);
            field1.setVisible(true);
            submitAnswer1.setVisible(true);
            
            
            
        }
      });
     
      submitAnswer1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field1.getText().equals(ans[1]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
            }
            else
            {
                live = live - 1;
                JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                
            }
            
            printImage.getChildren().removeAll(question1,pictureRegion1,answer1,field1,submitAnswer1);
            printImage.getChildren().addAll(question2,pictureRegion2,answer2,field2,submitAnswer2);
            pictureRegion2.setVisible(true);
            question2.setVisible(true);
            answer2.setVisible(true);
            field2.setVisible(true);
            submitAnswer2.setVisible(true);
            
            
            
            
        }
      });
      
       submitAnswer2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field2.getText().equals(ans[2]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
            }
            else
            {
                live = live - 1;
                JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                
            }    
            
            printImage.getChildren().removeAll(question2,pictureRegion2,answer2,field2,submitAnswer2);
            printImage.getChildren().addAll(question3,pictureRegion3,answer3,field3,submitAnswer3);
            pictureRegion3.setVisible(true);
            question3.setVisible(true);
            answer3.setVisible(true);
            field3.setVisible(true);
            submitAnswer3.setVisible(true);
            
        }
      });
       
       submitAnswer3.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field3.getText().equals(ans[3]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                 submitAnswer4.setVisible(true);
            }
            else
            {
                if(live == 0)
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer4.setVisible(true);
                }
            }
            printImage.getChildren().removeAll(question3,pictureRegion3,answer3,field3,submitAnswer3);
            printImage.getChildren().addAll(question4,pictureRegion4,answer4,field4,submitAnswer4);
            pictureRegion4.setVisible(true);
            question4.setVisible(true);
            answer4.setVisible(true);
            field4.setVisible(true);
            
                
            
           
        }
      });
       
       submitAnswer4.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field4.getText().equals(ans[4]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer5.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer5.setVisible(true);
                }
                
            }
            
            printImage.getChildren().removeAll(question4,pictureRegion4,answer4,field4,submitAnswer4);
            printImage.getChildren().addAll(question5,pictureRegion5,answer5,field5,submitAnswer5);
            pictureRegion5.setVisible(true);
            question5.setVisible(true);
            answer5.setVisible(true);
            field5.setVisible(true);
            
            
        }
      });
       
      submitAnswer5.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field5.getText().equals(ans[5]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                level2.setVisible(true);
                level1.setVisible(false);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                     level2.setVisible(true);
                    level1.setVisible(false);
                }
                
            }
            printImage.getChildren().removeAll(question5,pictureRegion5,answer5,field5,submitAnswer5);
            
            
            
        }
      }); 
      
      level2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            printImage.getChildren().removeAll(question5,pictureRegion5,answer5,field5,submitAnswer5);
            printImage.getChildren().addAll(question6,pictureRegion6,answer6,field6,submitAnswer6);
            pictureRegion6.setVisible(true);
            question6.setVisible(true);
            answer6.setVisible(true);
            field6.setVisible(true);
            submitAnswer6.setVisible(true);
        }
      });
   
      submitAnswer6.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            if(field6.getText().equals(ans[6]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer7.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer7.setVisible(true);
                }
                
            }
            
            printImage.getChildren().removeAll(question6,pictureRegion6,answer6,field6,submitAnswer6);
            printImage.getChildren().addAll(question7,pictureRegion7,answer7,field7,submitAnswer7);
            pictureRegion7.setVisible(true);
            question7.setVisible(true);
            answer7.setVisible(true);
            field7.setVisible(true);
            submitAnswer7.setVisible(true);
            
            
        }
      });

       submitAnswer7.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field7.getText().equals(ans[7]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer8.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer8.setVisible(true);
                }
                
            }
            
            
            printImage.getChildren().removeAll(question7,pictureRegion7,answer7,field7,submitAnswer7);
            printImage.getChildren().addAll(question8,pictureRegion8,answer8,field8,submitAnswer8);
            pictureRegion8.setVisible(true);
            question8.setVisible(true);
            answer8.setVisible(true);
            field8.setVisible(true);
            submitAnswer8.setVisible(true);
            
            
        }
      });
       
       submitAnswer8.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field8.getText().equals(ans[8]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer9.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer9.setVisible(true);
                }
                
            }
            
            printImage.getChildren().removeAll(question8,pictureRegion8,answer8,field8,submitAnswer8);
            printImage.getChildren().addAll(question9,pictureRegion9,answer9,field9,submitAnswer9);
            pictureRegion9.setVisible(true);
            question9.setVisible(true);
            answer9.setVisible(true);
            field9.setVisible(true);
            submitAnswer9.setVisible(true);
            
            
        }
      });
       
      submitAnswer9.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field9.getText().equals(ans[9]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer10.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer10.setVisible(true);
                }
                
            }
            
            printImage.getChildren().removeAll(question9,pictureRegion9,answer9,field9,submitAnswer9);
            printImage.getChildren().addAll(question10,pictureRegion10,answer10,field10,submitAnswer10);
            pictureRegion10.setVisible(true);
            question10.setVisible(true);
            answer10.setVisible(true);
            field10.setVisible(true);
            submitAnswer10.setVisible(true);
            
            
        }
      }); 
      
      submitAnswer10.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field10.getText().equals(ans[10]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                }
                
            }
            
            printImage.getChildren().removeAll(question10,pictureRegion10,answer10,field10,submitAnswer10);
           level2.setVisible(false);
           level3.setVisible(true);
            
            
        }
      });
      
      level3.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            printImage.getChildren().addAll(question11,pictureRegion11,answer11,field11,submitAnswer11);
            pictureRegion11.setVisible(true);
            question11.setVisible(true);
            answer11.setVisible(true);
            field11.setVisible(true);
            submitAnswer11.setVisible(true);
        }
      });
      
      submitAnswer11.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field11.getText().equals(ans[11]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer12.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer12.setVisible(true);
                }
                
            }
            
            
            
            printImage.getChildren().removeAll(question11,pictureRegion11,answer11,field11,submitAnswer11);
            printImage.getChildren().addAll(question12,pictureRegion12,answer12,field12,submitAnswer12);
            pictureRegion12.setVisible(true);
            question12.setVisible(true);
            answer12.setVisible(true);
            field12.setVisible(true);
            submitAnswer12.setVisible(true);
        }
      });
      
      submitAnswer12.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field12.getText().equals(ans[12]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer13.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer13.setVisible(true);
                }
                
            }
            
            
            printImage.getChildren().removeAll(question12,pictureRegion12,answer12,field12,submitAnswer12);
            printImage.getChildren().addAll(question13,pictureRegion13,answer13,field13,submitAnswer13);
            pictureRegion13.setVisible(true);
            question13.setVisible(true);
            answer13.setVisible(true);
            field13.setVisible(true);
            submitAnswer13.setVisible(true);
        }
      });
      
      submitAnswer13.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            if(field13.getText().equals(ans[13]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer14.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer14.setVisible(true);
                }
                
            }
            
             printImage.getChildren().removeAll(question13,pictureRegion13,answer13,field13,submitAnswer13);
            printImage.getChildren().addAll(question14,pictureRegion14,answer14,field14,submitAnswer14);
            pictureRegion14.setVisible(true);
            question14.setVisible(true);
            answer14.setVisible(true);
            field14.setVisible(true);
            submitAnswer14.setVisible(true);
        }
      });
      
      
      submitAnswer14.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field14.getText().equals(ans[14]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer15.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer15.setVisible(true);
                }
                
            }
            
            
             printImage.getChildren().removeAll(question14,pictureRegion14,answer14,field14,submitAnswer14);
            printImage.getChildren().addAll(question15,pictureRegion15,answer15,field15,submitAnswer15);
            pictureRegion15.setVisible(true);
            question15.setVisible(true);
            answer15.setVisible(true);
            field15.setVisible(true);
            submitAnswer15.setVisible(true);
        }
      });
      
      submitAnswer15.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field15.getText().equals(ans[15]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
             }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                   
                }
                
            }
            
            
             printImage.getChildren().removeAll(question15,pictureRegion15,answer15,field15,submitAnswer15);
             level3.setVisible(false);
             level4.setVisible(true);
        }
      });
      
      level4.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            printImage.getChildren().addAll(question16,pictureRegion16,answer16,field16,submitAnswer16);
            pictureRegion16.setVisible(true);
            question16.setVisible(true);
            answer16.setVisible(true);
            field16.setVisible(true);
            submitAnswer16.setVisible(true);
        }
      });
      
      submitAnswer16.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field16.getText().equals(ans[16]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer17.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer17.setVisible(true);
                }
                
            }
            
            
            printImage.getChildren().removeAll(question16,pictureRegion16,answer16,field16,submitAnswer16);
            printImage.getChildren().addAll(question17,pictureRegion17,answer17,field17,submitAnswer17);
            pictureRegion17.setVisible(true);
            question17.setVisible(true);
            answer17.setVisible(true);
            field17.setVisible(true);
            submitAnswer17.setVisible(true);
        }
      });
      
      submitAnswer17.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            if(field17.getText().equals(ans[17]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer18.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer18.setVisible(true);
                }
                
            }
            
             printImage.getChildren().removeAll(question17,pictureRegion17,answer17,field17,submitAnswer17);
            printImage.getChildren().addAll(question18,pictureRegion18,answer18,field18,submitAnswer18);
            pictureRegion18.setVisible(true);
            question18.setVisible(true);
            answer18.setVisible(true);
            field18.setVisible(true);
            submitAnswer18.setVisible(true);
        }
      });
      
      submitAnswer18.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field18.getText().equals(ans[18]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer19.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer19.setVisible(true);
                }
                
            }
            
            
             printImage.getChildren().removeAll(question18,pictureRegion18,answer18,field18,submitAnswer18);
            printImage.getChildren().addAll(question19,pictureRegion19,answer19,field19,submitAnswer19);
            pictureRegion19.setVisible(true);
            question19.setVisible(true);
            answer19.setVisible(true);
            field19.setVisible(true);
            submitAnswer19.setVisible(true);
        }
      });
      
      
      submitAnswer19.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field19.getText().equals(ans[19]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer20.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer20.setVisible(true);
                }
                
            }
            
            
             printImage.getChildren().removeAll(question19,pictureRegion19,answer19,field19,submitAnswer19);
            printImage.getChildren().addAll(question20,pictureRegion20,answer20,field20,submitAnswer20);
            pictureRegion20.setVisible(true);
            question20.setVisible(true);
            answer20.setVisible(true);
            field20.setVisible(true);
            submitAnswer20.setVisible(true);
        }
      });
      
      submitAnswer20.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            if(field20.getText().equals(ans[20]))
            {
                score = score + 1;
                  JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                }
                
            }
            
            
             printImage.getChildren().removeAll(question20,pictureRegion20,answer20,field20,submitAnswer20);
             level4.setVisible(false);
             level5.setVisible(true);
        }
      });
      
      
      level5.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            
            
            printImage.getChildren().addAll(question21,pictureRegion21,answer21,field21,submitAnswer21);
            pictureRegion21.setVisible(true);
            question21.setVisible(true);
            answer21.setVisible(true);
            field21.setVisible(true);
            submitAnswer21.setVisible(true);
        }
      });
      
      submitAnswer21.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
             
            if(field21.getText().equals(ans[21]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer22.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer22.setVisible(true);
                }
                
            }
            
            
            printImage.getChildren().removeAll(question21,pictureRegion21,answer21,field21,submitAnswer21);
            printImage.getChildren().addAll(question22,pictureRegion22,answer22,field22,submitAnswer22);
            pictureRegion22.setVisible(true);
            question22.setVisible(true);
            answer22.setVisible(true);
            field22.setVisible(true);
            submitAnswer22.setVisible(true);
        }
      });
      
      submitAnswer22.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field22.getText().equals(ans[22]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer23.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer23.setVisible(true);
                }
                
            }
            
            
             printImage.getChildren().removeAll(question22,pictureRegion22,answer22,field22,submitAnswer22);
            printImage.getChildren().addAll(question23,pictureRegion23,answer23,field23,submitAnswer23);
            pictureRegion23.setVisible(true);
            question23.setVisible(true);
            answer23.setVisible(true);
            field23.setVisible(true);
            submitAnswer23.setVisible(true);
        }
      });
      
      submitAnswer23.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field23.getText().equals(ans[23]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer24.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer24.setVisible(true);
                }
                
            }
            
            
             printImage.getChildren().removeAll(question23,pictureRegion23,answer23,field23,submitAnswer23);
            printImage.getChildren().addAll(question24,pictureRegion24,answer24,field24,submitAnswer24);
            pictureRegion24.setVisible(true);
            question24.setVisible(true);
            answer24.setVisible(true);
            field24.setVisible(true);
            submitAnswer24.setVisible(true);
        }
      });
      
      
      submitAnswer24.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field24.getText().equals(ans[24]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                submitAnswer25.setVisible(true);
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    submitAnswer25.setVisible(true);
                }
                
            }
            
             printImage.getChildren().removeAll(question24,pictureRegion24,answer24,field24,submitAnswer24);
            printImage.getChildren().addAll(question25,pictureRegion25,answer25,field25,submitAnswer25);
            pictureRegion25.setVisible(true);
            question25.setVisible(true);
            answer25.setVisible(true);
            field25.setVisible(true);
            submitAnswer25.setVisible(true);
        }
      });
      
      submitAnswer25.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if(field25.getText().equals(ans[25]))
            {
                score = score + 1;
                JOptionPane.showMessageDialog(null,"Correct Answer, Score: "+score);
                
            }
            else
            {
                if(live == 0)
                {
                    JOptionPane.showMessageDialog(null,"Game Over, Live: "+live);
                    System.exit(0);
                }
                else
                {
                    live = live - 1;
                    JOptionPane.showMessageDialog(null,"Wrong Answer, Live: "+live);
                    
                }
                
            }
            
             printImage.getChildren().removeAll(question25,pictureRegion25,answer25,field25,submitAnswer25);
             level5.setVisible(false);
             login.setVisible(true);
             JOptionPane.showMessageDialog(null,"Game Finish !!! Score: "+score+" , Live: "+live);
             
        }
      });
      
      
    HBox hb = new HBox();
    hb.setSpacing(20);
    hb.setAlignment(Pos.CENTER_LEFT);
    hb.getChildren().addAll(login);
    hb.getChildren().addAll(exit);
    hb.getChildren().addAll(logout);
    hb.getChildren().addAll(label1, name);
    hb.getChildren().addAll(label2, pb);
    hb.getChildren().addAll(register); 
    vb.getChildren().addAll(hb,message);
    
    
    HBox hb1 = new HBox();
    hb1.setSpacing(40);
    hb1.setAlignment(Pos.CENTER_LEFT);
    hb1.getChildren().addAll(level1);
    hb1.getChildren().addAll(level2);
    hb1.getChildren().addAll(level3);
    hb1.getChildren().addAll(level4);
    hb1.getChildren().addAll(level5);
    vb.getChildren().addAll(hb1);
  
   
    vb.getChildren().addAll(printImage);
    scene.setRoot(vb);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}