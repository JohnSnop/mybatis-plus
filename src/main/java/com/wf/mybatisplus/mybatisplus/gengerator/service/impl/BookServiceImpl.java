package com.wf.mybatisplus.mybatisplus.gengerator.service.impl;

import com.wf.mybatisplus.mybatisplus.gengerator.entity.Book;
import com.wf.mybatisplus.mybatisplus.gengerator.mapper.BookMapper;
import com.wf.mybatisplus.mybatisplus.gengerator.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wf
 * @since 2020-05-23
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
