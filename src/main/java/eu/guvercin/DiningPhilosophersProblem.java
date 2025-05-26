package eu.guvercin;

public class DiningPhilosophersProblem {
    public static void main(String[] args){
        int numberOfPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
        Fork[] forks = new Fork[numberOfPhilosophers];

        for (int i=0; i < numberOfPhilosophers; i++){
            forks[i] = new Fork(i);
        }
        for (int i=0; i< numberOfPhilosophers; i++){
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % numberOfPhilosophers];

            philosophers[i] = new Philosopher(i, leftFork, rightFork);
            Thread thread = new Thread(philosophers[i], "Philosopher " +i);
            thread.start();
        }
    }
}
