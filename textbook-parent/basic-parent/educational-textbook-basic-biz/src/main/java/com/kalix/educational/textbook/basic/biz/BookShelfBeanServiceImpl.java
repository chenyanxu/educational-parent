package com.kalix.educational.textbook.basic.biz;


import com.kalix.educational.textbook.basic.api.biz.IBookRoomBeanService;
import com.kalix.educational.textbook.basic.api.biz.IBookShelfBeanService;
import com.kalix.educational.textbook.basic.api.dao.IBookShelfBeanDao;
import com.kalix.educational.textbook.basic.entities.BookRoomBean;
import com.kalix.educational.textbook.basic.entities.BookShelfBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.general.org.api.biz.ISchoolZoneBeanService;
import com.kalix.general.org.entities.SchoolZoneBean;


/**
 * Created by zangyanming on 2018-8-6.
 */
public class BookShelfBeanServiceImpl extends ShiroGenericBizServiceImpl<IBookShelfBeanDao, BookShelfBean> implements IBookShelfBeanService {

    private IBookRoomBeanService bookRoomBeanService;
    private ISchoolZoneBeanService schoolZoneBeanService;
    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i = 0; i < jsonData.getData().size(); i++) {
            BookShelfBean bookshlfBean = (BookShelfBean) jsonData.getData().get(i);
            BookRoomBean bookRoomBean = bookRoomBeanService.getEntity(bookshlfBean.getRcode());
            bookshlfBean.setRcodeName(bookRoomBean.getName());
            SchoolZoneBean schoolZoneBean = schoolZoneBeanService.getEntity(bookshlfBean.getSarea());
            bookshlfBean.setSareaName(schoolZoneBean.getZwmc());
        }

        return jsonData;
    }

    @Override
    public BookShelfBean getEntity(long entityId) {
        BookShelfBean bookShelfBean = super.getEntity(entityId);
        BookRoomBean bookRoomBean = bookRoomBeanService.getEntity(bookShelfBean.getRcode());
        bookShelfBean.setRcodeName(bookRoomBean.getName());
        SchoolZoneBean schoolZoneBean = schoolZoneBeanService.getEntity(bookShelfBean.getSarea());
        bookShelfBean.setSareaName(schoolZoneBean.getZwmc());
        return bookShelfBean;
    }

    public void setBookRoomBeanService(IBookRoomBeanService bookRoomBeanService) {
        this.bookRoomBeanService = bookRoomBeanService;
    }

    public void setSchoolZoneBeanService(ISchoolZoneBeanService schoolZoneBeanService) {
        this.schoolZoneBeanService = schoolZoneBeanService;
    }
}
