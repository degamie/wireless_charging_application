    //WID(4/4/2026)(DegamieSign)(Sarthak Mittal)#1.1.1.1C#1.1.1.1.1.1.1.1.1.1.1C.1
import javax.swing.event.MenuEvent;
    public class MainMenuScreen extends SimpleApplication{
        public void existsByNainMenu(String MainMenu);
        public MainMenuScreen updateByMainMenu(MainMenu mainMenu){
            getMainMenu(mainMenu)+setMainMenu(mainMenu)+1;
        }
        public void setMainMenu(MainMenu mainMenu){this.mainmenu=mainMenu;}
        public SimpleApplication existsBySimpleApplication(SimpleApplication simpleApplication) {
            if(simpleApplication!=null)getSimpleApplication(simpleApplication);
            else getSimpleApplication(null);
        }

        public void updateBySimpleApplication(SimpleApplication simpleApplication){getSimpleApplication(simpleApplication)+setSimplApplication(simpleApplication)+1;}//Updating SimpleApplication in App
        public void setMenuScreen(MainMenuScreen menuScreen){this.menuScreen=menuScreen;}
        public SimpleApplication getSimpleApplication() {
            return simpleApplication;
        }

        public SimpleApplication simpleApplication;
    MainMenuScreen menuScreen=new MainMenuScreen();
    public void existsByMainMenuScreen(MainMenuScreen mainMenuScreen){
          if(menuScreen!=null)getMainMenu( mainMenuScreen );
          else getMainMenu( null );
        }
    public String updateByMainMenuScreen(MainMenuScreen mainMenuScreen){
        getMainMenu(mainMenuScreen)+setMainMenu(menuScreen)+1;//updating MainMenu Screen
    }
    public void setMainMenu(MainMenuScreen menuScreen){this.menuScreen=menuScreen;}//Binding MainMenu Screen In App
    public MainMenuScreen getMainMenu(MainMenuScreen menuScreen){return  menuScreen;}//Fetching MainMenuScreen in App
    public String MainMenu(String[] args){
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public MenuBar updateByMenuBar(MenuBar menuBar){
            getMenuBar(menuBar+setMenuBar(menuBar)+1;
        }
        public void setMenuBar(MenuBar menubar){this.menubar=menubar;}//Binding MEnuBar in App
        public MenuBar getMenuBar(MenuBar menubar){return menuBar;}//Fetching MenuBar in App
        public FileMenu getexitMenu(exitMenu){return exitMenu;}//Fetching exitMenu in App
        public String getexitMenu(FileMenu exitMenu){return exitMenu;}//Fetching exitMenu
        public void setexitMenu(FileMenu exitMenu){this.exitMenu=exitMenu;}//Bidning  ExitMenu in App
        public String getopenMenu(FileMenu openMenu){return  openMenu;}//Fetching OpenMenu
    public String getMenuBar(MenuBar menubar){return menuBar;}//Fetching MenuBar in App
        public String getMenu(MenuBar menuBar){return menuBar;}//Fetching menuBar
        public String getSaveMenu(FileMenu SaveMenu){return SaveMenu;}//Fetching Save menu
        public String updateByMenu(FileMenu menu,MenuBar menuBar){getMenu(menuBar)+setmenu(menuBar)+1;}//updating Menu in App
        public void setSaveMenu(FileMenu saveMenu){this.savemenu=SaveMenu;}//Binding SaveMemu in Server
        public String updateAllbySaveMenu(FileMenu saveMenu){getSaveMenu(saveMenu)+set(SaveMenu)+1;}//UPDATING Save M
        public String updateByOpenMenu(String OpenMenu){getopenMenu(openMenu)+setOpenmenu(openMenu)+1;}//Updating OpenMenu in Server
        public String existsByOpenMenu(String OpenMenu){
            if(openMenu!=null){
                getopenMenu(openMenu);
            }
            else getopenMenu(0);
        }
        public String setMenu(MenuBar menuBar){this.menuBar=menuBar;}//Binding MenuBar
        filemenu.getItems().addAll(openMenu,SaveMenu,exitMenu);
        MainMenuScreen(MenuBar menuBar){
            this.menuBar=menuBar;
        }
        public String updateByMenu(Menubar menu){getMenu(menu)+setMenu(menu)+1;}//Up[dating Menu in App

        public MenuEvent onMenuStrart(UserInput userInp,MenuBar menuBar,String[] path){
            while(userInp!=notifyAll()){   
                    if(!userInp.KEYBOARD_RIGHT_CLICK==null ||!userInp.KEYBOARD_LEFT_CLICK==null )openMenu.show();
                    else if(!userInp.KEYBOARD_RIGHT_CLICK==null ||!userInp.KEYBOARD_LEFT_CLICK==null )SaveMenu.show();
                    else if(!userInp.KEYBOARD_RIGHT_CLICK==null ||!userInp.KEYBOARD_LEFT_CLICK==null )exitMenu.show();
                    else menuBar.hide();}
     
         return menuBar;    

        }

    }//     menuBar.getMenus().addAll(filemenu,editMenu,viewMenu,helpMenu);
          
    public String EditMenu(String[] args,EditMenu editMenu,EditMenu soundMenu,EditMenu VideoMenu,EditMenu OptionsMenu){
        EditMenu editMenu=new EditMenu();
        EditMenu soundMenu=new FileMenu("soundMenu");
        EditMenu VideoMenu=new FileMenu("=VideoMenu");
        EditMenu OptionsMenu=new FileMenu("OptionsMenu");

        filemenu.getItems().addAll(editMenu,soundMenu,VideoMenu,OptionsMenu);
    }
    public String getEditMenu(String[] args,EditMenu editMenu,EditMenu soundMenu,EditMenu VideoMenu,EditMenu OptionsMenu){
        EditMenu(args,editMenu,soundMenu,VideoMenu,OptionsMenu);
    }
}