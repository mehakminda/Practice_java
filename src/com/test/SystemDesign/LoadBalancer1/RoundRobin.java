package com.test.SystemDesign.LoadBalancer1;

import java.util.ArrayList;
import java.util.List;


/**
 * This algorithm distributes incoming requests to servers in a cyclic order. It assigns a request to the first server,
 * then moves to the second, third, and so on, and after reaching the last server, it starts again at the first.
 */

 class RoundRobinLB {
    private List<String> servers;
    private int currentIndex = 0;

    public RoundRobinLB(List<String> serverAddresses) {
        this.servers = new ArrayList<>(serverAddresses);
    }

     public synchronized String getNextServer() {
         if (servers.isEmpty()) {
             return null; // No servers available
         }
         String server = servers.get(currentIndex);
         currentIndex = (currentIndex + 1) % servers.size(); // Move to the next server, loop back if end is reached
         return server;
     }
}

public class RoundRobin {
    public static void main(String args[]){
           List<String> webServers=new ArrayList<String>();
           webServers.add("http://server1.example.com");
           webServers.add("http://server2.example.com");
           webServers.add("http://server3.example.com");

           RoundRobinLB loadBalancer = new RoundRobinLB(webServers);


            // Simulate incoming requests
            for (int i = 0; i < 10; i++) {
                String targetServer = loadBalancer.getNextServer();
                System.out.println("Request " + (i + 1) + " routed to: " + targetServer);
                // In a real application, you would make an actual HTTP request here
            }



    }
}
