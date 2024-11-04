package br.com.ds.example;

import br.com.ds.queue.Queue;

public class Server {
    public static void main(String[] Args){

        int size = 10;
        int threadsNumber = 1;
        int loopNumber = 10;
        int loopCurrent = 0;
        int maxRequestByLoop = 1000;

        int lossNumber = 0;
        int requestAccepted = 0;

        Queue queue = new Queue(size);
        Queue queueLostData = new Queue(size * loopNumber);
        Queue queueAcceptedData = new Queue(size * loopNumber);

        while(loopCurrent < loopNumber){

            int requestNumber =  (int) (Math.random() * maxRequestByLoop);

            for(int i = 0; i < requestNumber; i++){
                int requestCurrent = (int) (Math.random() *  2147483647);
                boolean  lostData = !queue.enqueue(requestCurrent);
                if(lostData){
                    lossNumber++;
                    queueLostData.enqueue(requestCurrent);
                }
            }

            for(int i = 0; threadsNumber > i; i++){
                int response = queue.dequeue();
                if(response != Queue.NULL_RESULT){
                    queueAcceptedData.enqueue(response);
                    requestAccepted++;
                }
            }

            loopCurrent++;

        }

        System.out.println(
            "FILA ENTRADA -----"
        );

        System.out.println(
            queue.print()
        );

        System.out.println(
            "DADOS RESPONDIDOS -----"
        );

        System.out.println(
            queueAcceptedData.print()
        );

        System.out.println(
            "PERDA DE DADOS -----"
        );

        System.out.println(
            queueLostData.print()
        );

        System.out.println(
            "Numero de requisições respondidas:" + requestAccepted
        );

        System.out.println(
            "Numero de perdas:" + lossNumber
        );
    }
}
