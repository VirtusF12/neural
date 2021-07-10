


public class Neuron {

    private int numNeuron;
    private double weights[];
    private double out;

    public Neuron(int numNeuron) {
        this.numNeuron = numNeuron;
        weights = new double[2];
        out = 0.0;
        genWeights();
    }

    public double getWeight(int index) {
        return weights[index];
    }

    public void setWeight(int index, double weight) {
        weights[index] = weight;
    }

    public double getOut(){
        return this.out;
    }

    public void setOut(double out) {
        this.out = out;
    }

    public double[] getWeights(){
        return this.weights;
    }

    private void genWeights() {

        if (weights != null) {
            for (int i = 0; i < weights.length; i++) {
                weights[i] = Math.random();
            }
        } else {
            System.out.println("weights == null :(");
        }
    }

    public void showWeights(){
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]+" ");
        }
        System.out.println();
    }
}
