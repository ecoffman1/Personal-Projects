class Model {
    View view;

    public void yell(){
        this.view.shout();
    }
}

class View {
    Model model;
    String identity;

    View(Model m, String i){
        this.model = m;
        this.model.view = this;
        this.identity = i;
    }

    public void shout(){
        System.out.println(this.identity);
    }
}

class test{
    public static void main(String[] args){
        Model obj = new Model();
        View obj2 = new View(obj, "test");
        obj.yell();
    }
}