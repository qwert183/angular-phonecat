package service;

import controller.PhoneController;
import model.Phone;
import model.PhoneDetail;
import model.PhoneForAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PhoneRepository;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    public PhoneDetail findPhoneById(int id) {return phoneRepository.findPhoneById(id);}

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    public int newPhoneWithAdd(PhoneForAdd phoneForAdd) {
        return phoneRepository.newPhoneWithAdd(phoneForAdd);
    }
}