package project;

import java.sql.*;
import java.util.Scanner;
public class App {
   static final String DB_URL = "jdbc:mysql://localhost:3306/julia"; 
   static final String USER = "root";
   static final String PASS = "julia@2000*";
   
   public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    label:
        while(true)
        {
            
            System.out.println("***********************************************\n\n");
            System.out.println("select your role:\n1.Librarian\n2.Reader\n3.exit\n");
            int mainoption= scan.nextInt();
            switch(mainoption)
            {
                case 1:
                    //librn
                    while(true)
                    {
                        System.out.println("***********************************************\n\n");
                        System.out.println("Select the operation you want to perform:\n1.Add book\n2.edit book details\n3.list the books lent by the reader\n4.Exit\n");
                        int liboption= scan.nextInt();
                        switch(liboption)
                        {
                            case 1:
                                System.out.println("Enter the book details seperated by space:\n");
                                Scanner scan1 = new Scanner(System.in);
                                String details= scan1.nextLine();
                                String parts[]= details.split(" ");
                                String query1;
                                
                                query1="INSERT INTO lib VALUES('"+parts[0]+ "','" +parts[1]+ "','" +parts[2]+ "','" +parts[3]+ "','" +parts[4]+ "','" +parts[5]+ "','" +parts[6]+ "','" +parts[7]+ "','" +parts[8]+ "','"+parts[9]+ "');" ;

                                try{
                                    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                    Statement stmt = conn.createStatement();
                                    stmt.executeUpdate(query1);
                                    
                                    
                                    System.out.println("Inserted successfully");
                                    System.out.println("***********************************************\n\n");
                                } 
                                catch (SQLException e) 
                                    {
                                        e.printStackTrace();
                                    }


                            break;
                            case 2:
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM lib");

                                while (rs.next()) {
                                    
                                    System.out.print("Book ID: " + rs.getInt("BookID"));
                                    
                                }
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }    
                                System.out.println("***********************************************\n");
                            System.out.println("\nselect the bookID to change details");
                            String serbook= scan.next();
                            System.out.println("details of book"+serbook+":\n");
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM lib WHERE BookName='"+serbook+"'");

                                while (rs.next()) {
                                    
                                System.out.println("Book ID: " + rs.getInt("BookID"));
                                System.out.println("Book Name: " + rs.getString("BookName"));
                                System.out.println("Author Name: " + rs.getString("AuthorName"));
                                System.out.println("Publisher Name: " + rs.getString("Publishername"));
                                System.out.println("Publish Year: " + rs.getInt("PublisherYear"));
                                System.out.println("Genre: " + rs.getString("Genre"));
                                System.out.println("Rating: " + rs.getInt("Rating"));
                                System.out.println("Lendee: " + rs.getString("Lendee"));
                                System.out.println("Dateoflending: " + rs.getString("Dateoflending"));
                                System.out.println("Dateofreturn: " + rs.getString("Dateofreturn"));
                                }
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                } 
                                System.out.println("***********************************************\n");
                            System.out.println("Select the attribute of the book to change:\n1.Book Name\n2.Author Name\n3.Publisher name\n4.Publishing year\n5.Genre\n6.Rating\n7.Lendee\n8.Dateoflending\n9.Dateofreturn\n");
                            int choice= scan.nextInt();
                            if(choice<1||choice>9)
                            {
                                System.out.println("invalid option....operation terminated");
                                continue label;
                            }

                            System.out.println("enter the new value");
                            String rp= scan.next();
                            String updateq="";
                            
                            switch(choice)
                            {   
                                case 1:
                                updateq="UPDATE lib SET BookName='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 2:
                                    
                                updateq="UPDATE lib SET AuthorName='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 3:
                                    
                                updateq="UPDATE lib SET Publishername='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 4:
                                    
                                updateq="UPDATE lib SET PublisherYear='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 5:
                                   
                                updateq="UPDATE lib SET Genre='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 6:
                                    
                                updateq="UPDATE lib SET Rating='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 7:
                                    
                                updateq="UPDATE lib SET Lendee='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 8:
                                   
                                updateq="UPDATE lib SET Dateoflending='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                case 9:
                                    
                                updateq="UPDATE lib SET Dateofreturn='"+rp+"'WHERE BookID='"+serbook+"';";
                                break;

                                
                            }
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                stmt.executeUpdate(updateq);
                                
                                System.out.println("Update successful");
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }

                                System.out.println("***********************************************\n");
                            break;    
                            case 3:
                            System.out.println("enter reader name:");
                            String readername= scan.next();
                            String lendeesr= "SELECT * FROM lib WHERE Lendee = '"+readername+"'";
                            
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery(lendeesr);
                                while (rs.next()) {
                                    System.out.println("Book Name: " + rs.getString("BookName")+"\n");
                                
                            } }
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }

                                System.out.println("***********************************************\n");
                                break;
                            
                                case 4:
                                    continue label;
                            default:
                                System.out.println("invlaid option\n");
                                System.out.println("***********************************************\n");
                        }
                    }
                
                case 2:
                //reader
                while(true)
                    {
                        System.out.println("Select the operation you want to perporm:\n1.list all books\n2.search by author name\n3.search by book name\n4.Exit\n");
                        int readeroption= scan.nextInt();
                        switch(readeroption)
                        {
                            case 1:
                                try{
                                    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                    Statement stmt = conn.createStatement();
                                    ResultSet rs = stmt.executeQuery("SELECT * FROM lib"); 
                                
                                while (rs.next()) {
                                
                                System.out.print("Book ID: " + rs.getInt("BookID"));
                                System.out.print(", Book Name: " + rs.getString("BookName"));
                                System.out.println(", Author Name: " + rs.getString("AuthorName"));
                                System.out.println(", Publisher Name: " + rs.getString("Publishername"));
                                System.out.println(", Publish Year: " + rs.getInt("PublisherYear"));
                                System.out.println(", Genre: " + rs.getString("Genre"));
                                System.out.println(", Rating: " + rs.getInt("Rating"));
                                                                
                                }
                                } 
                                catch (SQLException e) 
                                    {
                                        e.printStackTrace();
                                    }
                                    System.out.println("***********************************************\n\n");
                            break;
                            case 2:
                                    //search based on author name
                                    
                                    System.out.println("Enter the name of the author to search\n");
                                    String authorname= scan.nextLine();
                                    try{
                                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                        Statement stmt = conn.createStatement();
                                        ResultSet rs = stmt.executeQuery("SELECT * FROM lib WHERE AuthorName= '"+authorname+"'");
                                
                                while (rs.next()) {
                                
                                
                                System.out.print("Book ID: " + rs.getInt("BookID"));
                                System.out.print(", Book Name: " + rs.getString("BookName"));
                                System.out.println(", Author Name: " + rs.getString("AuthorName"));
                                                                                                
                                }
                                } 
                                catch (SQLException e) 
                                    {
                                        e.printStackTrace();
                                    }
                                    System.out.println("***********************************************\n\n");
                            break;
                            case 3:
                                    //search based on book name
                                    
                                    System.out.println("Enter the name of the author to search\n");
                                    String bookname= scan.nextLine();
                                    try{
                                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                        Statement stmt = conn.createStatement();
                                        ResultSet rs = stmt.executeQuery("SELECT * FROM lib "+"WHERE BookName ='"+bookname+"'");
                                
                                while (rs.next()) {
                                
                                System.out.print("Book ID: " + rs.getInt("BookID"));
                                System.out.print(", Book Name: " + rs.getString("BookName"));
                                System.out.println(", Author Name: " + rs.getString("AuthorName"));
                                }
                                
                                }
                                
                                catch (SQLException e) 
                                    {
                                        e.printStackTrace();
                                    }
                                    System.out.println("***********************************************\n\n");
                                break;                        
                            case 4:
                                continue label;

                            default:
                                System.out.println("enter a valid option\n");
                                System.out.println("***********************************************\n\n");
                    }
                }
                
                case 3:
                    return;

                default:
                    System.out.println("enter an valid option");
                    System.out.println("***********************************************\n\n");
                    
            }
        }   
   }
 
}