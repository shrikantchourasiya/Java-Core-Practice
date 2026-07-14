// overriding polymorphism
package polymorphism;

class Intro{
    void name (){
        System.out.println("Anchal");
    }
}

class profile extends Intro {
    void name (){
        System.out.println("dR. AACHAL");
    }
}

class index9 {
    public static void main(String[] args) {
        Intro p = new profile();
        p.name();
    }
}