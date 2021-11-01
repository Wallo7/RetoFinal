package com.usa.ciclo3.retociclo3.reports;

import com.usa.ciclo3.retociclo3.model.Client;

public class CountClients {
    private Double total;
    private Client client;

    public CountClients(Double total, Client client) {
        this.total = total;
        this.client = client;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
