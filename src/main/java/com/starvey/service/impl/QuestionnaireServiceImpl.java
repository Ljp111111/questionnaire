package com.starvey.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starvey.entity.Question;
import com.starvey.entity.Questionnaire;
import com.starvey.service.QuestionService;
import com.starvey.service.QuestionnaireService;
import com.starvey.mapper.QuestionnaireMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Song
 * @description 针对表【questionnaire】的数据库操作Service实现
 * @createDate 2022-10-30 13:48:23
 */
@Service
public class QuestionnaireServiceImpl extends ServiceImpl<QuestionnaireMapper, Questionnaire>
        implements QuestionnaireService{
    @Autowired
    QuestionService questionService;
    @Override
    public List<Question> listById(String id) {
        QueryWrapper<Question> wrapper=new QueryWrapper<Question>().eq("questionnaire_id",id);
        List<Question> list = questionService.list(wrapper);
        return list;
    }
}




