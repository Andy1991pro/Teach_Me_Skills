package ClassWork.LessonEight;

public class Tree {
        public static int TREE_COUNT =0;
    private String treeName;
    public static void printTreeCount(){
        System.out.println(TREE_COUNT);
    }


    public String getTreeName(){
        return treeName;
    }
    static {  // Статик блок вызывается до создания класса (самый первый)
        System.out.println("Hi");
    }

    public static class TreeHolder {// Сатичный класс позволяет создать только один ел=динственный объект
        public   static final Tree INSTANCE = new Tree();
            public static Tree getInstance(){
                return INSTANCE;
            }



        }
    }
