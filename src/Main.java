

public class Main {

    public static void main(String[] args) {

        NetworkNeuron nn = new NetworkNeuron(1, 1);

        Neuron S0 = nn.getNeuron(0);

        if (S0 == null) {
            System.out.println("такого нейрона нет");
        } else  {
            S0.showWeights();
        }

        Neuron S1 = nn.getNeuron(1);

        if (S1 == null) {
            System.out.println("такого нейрона нет");
        } else  {
            S1.showWeights();
        }
        System.out.println("---------------------------------");

        nn.showPowersNeurons();

        nn.study(0);


        nn.showPowersNeurons();
    }
}
