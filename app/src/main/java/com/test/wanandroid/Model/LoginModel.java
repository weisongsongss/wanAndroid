package com.test.wanandroid.Model;

import java.io.Serializable;
import java.util.List;

/**
 * 作者：weisongsong on 2022/5/6
 * <p>
 * 邮箱：15231167995@163.com
 */

public class LoginModel implements Serializable {

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * data : {"admin":false,"chapterTops":[],"coinCount":91,"collectIds":[],"email":"15231167995@163.com","icon":"","id":117567,"nickname":"骑着蜗牛追太阳","password":"","publicName":"骑着蜗牛追太阳","token":"","type":0,"username":"骑着蜗牛追太阳"}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public static class DataBean implements Serializable {
        public boolean isAdmin() {
            return admin;
        }

        public void setAdmin(boolean admin) {
            this.admin = admin;
        }

        public int getCoinCount() {
            return coinCount;
        }

        public void setCoinCount(int coinCount) {
            this.coinCount = coinCount;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPublicName() {
            return publicName;
        }

        public void setPublicName(String publicName) {
            this.publicName = publicName;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public List<?> getChapterTops() {
            return chapterTops;
        }

        public void setChapterTops(List<?> chapterTops) {
            this.chapterTops = chapterTops;
        }

        public List<?> getCollectIds() {
            return collectIds;
        }

        public void setCollectIds(List<?> collectIds) {
            this.collectIds = collectIds;
        }

        /**
         * admin : false
         * chapterTops : []
         * coinCount : 91
         * collectIds : []
         * email : 15231167995@163.com
         * icon :
         * id : 117567
         * nickname : 骑着蜗牛追太阳
         * password :
         * publicName : 骑着蜗牛追太阳
         * token :
         * type : 0
         * username : 骑着蜗牛追太阳
         */

        private boolean admin;
        private int coinCount;
        private String email;
        private String icon;
        private int id;
        private String nickname;
        private String password;
        private String publicName;
        private String token;
        private int type;
        private String username;
        private List<?> chapterTops;
        private List<?> collectIds;
    }
}
