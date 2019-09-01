package net.rooban;

import org.springframework.stereotype.Service;

import java.util.List;

public interface AppService {
    void saveEntry(AppEntity appEntity);
    List<AppEntity> listEntity();
}
