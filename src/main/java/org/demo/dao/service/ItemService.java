package org.demo.dao.service;


import org.demo.common.Item;
import org.demo.dao.ItemsDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class ItemService extends EntityService<Item> implements ItemsDao {

	
}

