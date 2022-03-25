package com.service.servicescriptmed.service;

import java.util.ArrayList;

import com.service.servicescriptmed.model.Prescriber;

import org.springframework.stereotype.Service;

@Service
public class PrescriberService {
    private ArrayList<Prescriber> prescribers = new ArrayList<Prescriber>();

    public Prescriber addPrescriber(Prescriber prescriber) {

        this.prescribers.add(prescriber);
        return prescriber;
    }

    public ArrayList<Prescriber> getPrescribers() {
        return this.prescribers;
    }

    public Prescriber getPrescriber(int exId) {
        for (int i = 0; i < prescribers.size(); i++) {
            Prescriber p = prescribers.get(i);
            if (p.isIdMatched(exId))
                return p;
        }
        return null;
    }
}
