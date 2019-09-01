package net.rooban;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional("transactionManager")
public class AppServiceImpl implements AppService {

    @Autowired
    private AppRepository appRepository;

    @Override
    public void saveEntry(AppEntity appEntity) {
        appRepository.save(appEntity);
    }

    @Override
    public List<AppEntity> listEntity() {
        return appRepository.findAll();
    }
}
