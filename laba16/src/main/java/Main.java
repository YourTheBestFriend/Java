/* ============================ interfeces of products ============================ */
interface Cheeze {
    long getCheezePrice();
}
interface Milk {
    long getMilkPrice();
}
interface SoureScream {
    long getSoureScreamPrice();
}
/* ============================ Initelization Abstract Factory ============================ */
interface InteAbsFactory {
    Cheeze getCheeze();
    Milk getMilk();
    SoureScream getSoureScream();
}

/*===================== Classes of type COW (Корова), GOAT (Коза), BIRD (Птица) ======================*/
// START =================================================================================================================== COW (Корова)
class Cow_CheezeImpl implements Cheeze {
    public long getCheezePrice() {
        return 1;
    }
}
class Cow_MilkImpl implements Milk {
    public long getMilkPrice() {
        return 2;
    }
}
class Cow_SoureScreamImpl implements SoureScream {
    public long getSoureScreamPrice() {
        return 3;
    }
}
class Cow_MilkPriceAbsFactory implements InteAbsFactory {
    public Cheeze getCheeze() {
        return new Cow_CheezeImpl();
    }
    public Milk getMilk() {
        return new Cow_MilkImpl();
    }
    public SoureScream getSoureScream() {
        return new Cow_SoureScreamImpl();
    }
}// END =================================================================================================================== COW (Корова)



// START =================================================================================================================== GOAT (Коза)
class Goat_CheezeImpl implements Cheeze {// вторая
    public long getCheezePrice() {
        return 10;
    }
}
class Goat_MilkImpl implements Milk {
    public long getMilkPrice() {
        return 20;
    }
}
class Goat_SoureScreamImpl implements SoureScream {
    public long getSoureScreamPrice() {
        return 30;
    }
}
class Goat_MilkPriceAbsFactory implements InteAbsFactory {
    public Cheeze getCheeze() {
        return new Goat_CheezeImpl();
    }
    public Milk getMilk() {
        return new Goat_MilkImpl();
    }
    public SoureScream getSoureScream() {
        return new Goat_SoureScreamImpl();
    }
}// END =================================================================================================================== GOAT (Коза)



// START =================================================================================================================== BIRD (Птица)
class Bird_CheezeImpl implements Cheeze {// вторая
    public long getCheezePrice() {
        return 100;
    }
}
class Bird_MilkImpl implements Milk {
    public long getMilkPrice() {
        return 200;
    }
}
class Bird_SoureScreamImpl implements SoureScream {
    public long getSoureScreamPrice() {
        return 300;
    }
}
class Bird_MilkPriceAbsFactory implements InteAbsFactory {
    public Cheeze getCheeze() {
        return new Goat_CheezeImpl();
    }
    public Milk getMilk() {
        return new Goat_MilkImpl();
    }
    public SoureScream getSoureScream() {
        return new Goat_SoureScreamImpl();
    }
}// END =================================================================================================================== BIRD (Птица)

/* OUR class and main*/
public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////// Type of product (Cow Goat Bird)
        //String Type_Product = "Cow";
        String Type_Product = "Goat";
        //String Type_Product = "Bird";

        // Create Abs Factory (Create variors Product)
        InteAbsFactory ifactory = null;

        // Check our product
        if(Type_Product.equals("Cow"))
        {
            ifactory = new Cow_MilkPriceAbsFactory();
        }
        else if (Type_Product.equals("Goat"))
        {
            ifactory = new Goat_MilkPriceAbsFactory();
        }
        else if (Type_Product.equals("Bird"))
        {
            ifactory = new Bird_MilkPriceAbsFactory();
        }

        // Ini.. products
        Cheeze Cheeze = ifactory.getCheeze();
        Milk Milk = ifactory.getMilk();
        SoureScream SoureScream = ifactory.getSoureScream();

        // print fot check
        System.out.println(Cheeze.getCheezePrice());
        System.out.println(Milk.getMilkPrice());
        System.out.println(SoureScream.getSoureScreamPrice());
    }
}
