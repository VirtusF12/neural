
public class NetworkNeuron {

    private Neuron neurons[];
    private int x1, x2;

    public NetworkNeuron(int x1, int x2){
        this.x1 = x1; this.x2 = x2;
        neurons = new Neuron[2];
        createNeurons();

        powerNeurons();
    }

    public void study(int numNeuron){

        switch (numNeuron) {
            case 0:
                if (neurons[0].getOut() > neurons[1].getOut()) {
                    System.out.println("нейроно 0 обучать не нужно");
                } else {
                    // выполнить обучение
                    int count = 0;
                    while (neurons[0].getOut() < neurons[1].getOut()) {
                        neurons[0].setWeight(0, neurons[0].getWeight(0)+0.1);
                        neurons[1].setWeight(0, neurons[1].getWeight(0)+0.1);

                        powerNeurons();

                        for (int i = 0; i < neurons.length; i++) {
                            neurons[i].showWeights();
                        }

                        count++;
                    }

                    System.out.println("count = " + count);
                }
                ;break;
            case 1:
                if (neurons[1].getOut() > neurons[0].getOut()) {
                    System.out.println("нейроно 1 обучать не нужно");
                } else {
                    // выполнить обучение
                }
                ;break;
            default:
                System.out.println("такого нейрона для обучения нет!!!");
                ;break;
        }
    }

    public void showPowersNeurons(){
        for (int i = 0; i < neurons.length; i++) {
            System.out.println("S"+i+": " + neurons[i].getOut());
        }
    }


    private void powerNeurons() {
        double sum = 0.0;
        for (int i = 0; i < neurons[0].getWeights().length; i++) {
            sum = neurons[0].getWeights()[i]*x1 + neurons[1].getWeights()[i]*x2;
            neurons[i].setOut(sum);
        }
    }

    private void createNeurons(){
        for (int i = 0; i < neurons.length; i++) {
            neurons[i] = new Neuron(i);
        }
    }

    public Neuron getNeuron(int indexNeuron) {

        if (indexNeuron < 0 || indexNeuron >= neurons.length)
            return null;
        else
            return neurons[indexNeuron];
    }
}
