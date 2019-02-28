package com.lancet.person.dao.impl;

import com.lancet.base.dao.impl.BaseDaoImpl;
import com.lancet.person.dao.PersonDao;
import com.lancet.person.entity.Person;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户Dao实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository
public class PersonDaoImpl extends BaseDaoImpl implements PersonDao {
    @Override
    public void add(Person person) {
        Session session = this.getSessionFactory().openSession();
        session.save(person);
        session.close();
    }

    @Override
    public void update(Person person) {
        Session session = this.getSessionFactory().openSession();
        session.update(person);
        session.close();
    }

    @Override
    public void delete(Person person) {
        Session session = this.getSessionFactory().openSession();
        session.delete(person);
        session.close();
    }

    @Override
    public Person findById(Integer id) {
        Person result = null;
        String hql = "from Person where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<Person> persons = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(persons)) {
            result = persons.get(0);
        }
        return result;
    }

    @Override
    public List<Person> findByHql(String hql, Map<String, Object> parameters) {
        List<Person> result = null;
        Session session = this.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        for (String key : parameters.keySet()) {
            query.setParameter(key, parameters.get(key));
        }
        session.close();
        result = query.list();
        return result;
    }
}
