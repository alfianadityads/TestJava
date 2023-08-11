class Operation extends Input {

    public float penjumlahan() {
        return (input1 + input2);
    }

    public float pengurangan() {
        return (input1 - input2);
    }

    public float perkalian() {
        return (input1 * input2);
    }

    public float pembagian() {
        if (input2 == 0) {
            System.out.println("0");
        }
        return (input1 / input2);

    }
}
