
import java.util.*;

// Comparator to sort by Tail number (ascending)
class SortByTail implements Comparator<Naruto> {
    @Override
    public int compare(Naruto o1, Naruto o2) {
        return Integer.compare(o1.getTailBeast(), o2.getTailBeast());
    }
}

// Comparator to sort by Tail number (descending)
class SortByTailDescending implements Comparator<Naruto> {
    @Override
    public int compare(Naruto o1, Naruto o2) {
        return Integer.compare(o2.getTailBeast(), o1.getTailBeast());
    }
}

// Comparator to sort by Tail Beast Name
class SortByTailBeastName implements Comparator<Naruto> {
    @Override
    public int compare(Naruto o1, Naruto o2) {
        return o1.getTailBeastName().compareTo(o2.getTailBeastName());
    }
}

// Comparator to sort by Owner
class SortByOwner implements Comparator<Naruto> {
    @Override
    public int compare(Naruto o1, Naruto o2) {
        return o1.getOwner().compareTo(o2.getOwner());
    }
}

// Comparator to sort by Village
class SortByVillage implements Comparator<Naruto> {
    @Override
    public int compare(Naruto o1, Naruto o2) {
        return o1.getVillage().compareTo(o2.getVillage());
    }
}

// Class implementing Comparable (default sorting by tail number)
class Naruto implements Comparable<Naruto> {
    private int tailBeast;
    private String tailBeastName;
    private String owner;
    private String village;

    public Naruto(int tailBeast, String tailBeastName, String owner, String village) {
        this.tailBeast = tailBeast;
        this.tailBeastName = tailBeastName;
        this.owner = owner;
        this.village = village;
    }

    public int getTailBeast() {
        return tailBeast;
    }

    public String getTailBeastName() {
        return tailBeastName;
    }

    public String getOwner() {
        return owner;
    }

    public String getVillage() {
        return village;
    }

    @Override
    public int compareTo(Naruto o) {
        return Integer.compare(this.tailBeast, o.tailBeast);
    }

    @Override
    public String toString() {
        return "TailBeast=" + tailBeast + ", Name=" + tailBeastName +
               ", Owner=" + owner + ", Village=" + village;
    }
}

// Main class
public class ComparableAndComparatorExample {
    public static void main(String[] args) {
        Naruto n1 = new Naruto(9,"Kurama","Naruto","Hidden Leaf");
        Naruto n2 = new Naruto(1,"Shukaku","Gaara","Hidden Sand");
        Naruto n3 = new Naruto(8,"Gyuki","Killer Bee","Hidden Cloud");
        Naruto n4 = new Naruto(2,"Matatabi","Yugito Nii","Hidden Cloud");
        Naruto n5 = new Naruto(4,"Son Goku","Roshi","Hidden Stone");
        Naruto n6 = new Naruto(5,"Kokuo","Han","Hidden Stone");
        Naruto n7 = new Naruto(3,"Isobu","Yagura","Hidden Mist");
        Naruto n8 = new Naruto(6,"Saiken","Utakata","Hidden Mist");
        Naruto n9 = new Naruto(7,"Chomei","Fu","Hidden Waterfall");

        ArrayList<Naruto> list = new ArrayList<>();
        Collections.addAll(list, n1,n2,n3,n4,n5,n6,n7,n8,n9);

        System.out.println("✅ Sorted by Comparable (Tail Number Ascending):");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("\n✅ Sorted by Tail Number (Ascending):");
        Collections.sort(list, new SortByTail());
        list.forEach(System.out::println);

        System.out.println("\n✅ Sorted by Tail Beast Name:");
        Collections.sort(list, new SortByTailBeastName());
        list.forEach(System.out::println);

        System.out.println("\n✅ Sorted by Owner:");
        Collections.sort(list, new SortByOwner());
        list.forEach(System.out::println);

        System.out.println("\n✅ Sorted by Village:");
        Collections.sort(list, new SortByVillage());
        list.forEach(System.out::println);

        System.out.println("\n✅ Sorted by Tail Number (Descending):");
        Collections.sort(list, new SortByTailDescending());
        list.forEach(System.out::println);
    }
}
