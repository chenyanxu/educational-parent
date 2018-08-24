package com.kalix.educational.textbook.basic.biz;


import com.kalix.educational.textbook.basic.api.biz.IBookRoomBeanService;
import com.kalix.educational.textbook.basic.api.dao.IBookRoomBeanDao;
import com.kalix.educational.textbook.basic.entities.BookRoomBean;
import com.kalix.educational.textbook.basic.entities.BookShelfBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.general.org.api.biz.ISchoolZoneBeanService;
import com.kalix.general.org.entities.SchoolZoneBean;


/**
 * Created by zangyanming on 2018-8-6.
 */
public class BookRoomBeanServiceImpl extends ShiroGenericBizServiceImpl<IBookRoomBeanDao, BookRoomBean> implements IBookRoomBeanService {

    private ISchoolZoneBeanService schoolZoneBeanService;

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i = 0; i < jsonData.getData().size(); i++) {
            BookRoomBean bookRoomBean = (BookRoomBean) jsonData.getData().get(i);
            SchoolZoneBean schoolZoneBean = schoolZoneBeanService.getEntity(bookRoomBean.getSarea());
            bookRoomBean.setSareaName(schoolZoneBean.getZwmc());
        }

        return jsonData;
    }

    @Override
    public BookRoomBean getEntity(long entityId) {
        BookRoomBean bookRoomBean = super.getEntity(entityId);
        SchoolZoneBean schoolZoneBean = schoolZoneBeanService.getEntity(bookRoomBean.getSarea());
        bookRoomBean.setSareaName(schoolZoneBean.getZwmc());
        return bookRoomBean;
    }


    public void setSchoolZoneBeanService(ISchoolZoneBeanService schoolZoneBeanService) {
        this.schoolZoneBeanService = schoolZoneBeanService;
    }
}
