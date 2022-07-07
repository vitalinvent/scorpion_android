package com.vitalinvent.scorpion;

public interface ClientStatus {
    void onDisconnected();

    void onConnected();

    void onConnecting();
}
