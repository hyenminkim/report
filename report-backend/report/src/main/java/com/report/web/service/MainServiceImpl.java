package com.report.web.service;


import com.report.web.domain.Tk_framek;
import com.report.web.repository.TK_framekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements  MainService {

    @Autowired
    TK_framekRepository tk_framekRepository;

    @Override
    public List<Tk_framek> list() {
        return tk_framekRepository.findAll();
    }
}
