package com.step.assignments.oop_part_1.composition_jewellery;

public class JewelleryBox {
    private Jewellery jewellery;
    private JewelleryBox box;


    public JewelleryBox(Jewellery jewellery, JewelleryBox box) {
        this.jewellery = jewellery;
        this.box = box;
    }

    public JewelleryBox(Jewellery jewellery) {
        this(jewellery,null);
    }

    public JewelleryBox(JewelleryBox box) {
        this(null,box);
    }

    public JewelleryBox() {

    }

    public int totalJewelleries() {
        int totalJewellery = 0;
        if(this.jewellery!=null) totalJewellery+=1;

        if(this.box!=null) {
            totalJewellery += this.box.totalJewelleries();
        }

        return totalJewellery;
    }

}
