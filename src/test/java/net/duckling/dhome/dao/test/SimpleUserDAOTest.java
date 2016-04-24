/*
 * Copyright (c) 2008-2016 Computer Network Information Center (CNIC), Chinese Academy of Sciences.
 * 
 * This file is part of Duckling project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 */
package net.duckling.dhome.dao.test;

import junit.framework.Assert;
import net.duckling.dhome.dao.ISimpleUserDAO;
import net.duckling.dhome.dao.impl.SimpleUserDAO;
import net.duckling.dhome.domain.people.SimpleUser;

import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleUserDAOTest extends AbstractDAOTest {

    private static ISimpleUserDAO api;

    @BeforeClass
    public static void setup() throws Exception {
        SimpleUserDAO dao = new SimpleUserDAO();
        api = dao;
        setupDatabase(dao,"/data/user.xml");
    }

    @Test
    public void testGetUser()  {
        SimpleUser su = api.getUser(1);
        Assert.assertNotNull(su);
        Assert.assertEquals("小纯洁", su.getZhName());
    }
    
    @Test
    public void testGetUserByEmail()  {
        SimpleUser su = api.getUser("xiaochunjie@cnic.cn");
        Assert.assertNotNull(su);
        Assert.assertEquals("小纯洁", su.getZhName());
    }
    
//    @Test
//    public void testRegistAccount()  {
//        SimpleUser newUser = new SimpleUser();
//        newUser.setEmail("maven@cstnet.cn");
//        int id = api.registAccount(newUser);
//        SimpleUser su = api.getUser(id);
//        Assert.assertEquals(newUser.getEmail(), su.getEmail());
//    }

}