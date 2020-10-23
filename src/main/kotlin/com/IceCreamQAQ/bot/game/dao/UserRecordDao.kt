package com.IceCreamQAQ.bot.game.dao

import com.IceCreamQAQ.bot.game.entity.UserRecord
import com.icecreamqaq.yudb.jpa.hibernate.HibernateDao

class UserRecordDao : HibernateDao<UserRecord, Int>() {


    fun findByQqAndPool(qq: Long, pool: String) = search("from UserRecord where qq = ? and pool = ?", qq, pool)


}