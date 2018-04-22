package com.model.board;

import javax.persistence.*;

@Table(name = "bbs_board")
public class Board {
    @Id
    @Column(name = "boardId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardid;

    @Column(name = "boardType")
    private String boardtype;

    @Column(name = "parentId")
    private Integer parentid;

    @Column(name = "parentName")
    private String parentname;

    @Column(name = "Depth")
    private Integer depth;

    @Column(name = "rootId")
    private Integer rootid;

    private Integer child;

    private Integer orders;

    @Column(name = "readMe")
    private String readme;

    @Column(name = "boardMaster")
    private String boardmaster;

    @Column(name = "postNum")
    private Integer postnum;

    @Column(name = "topicNum")
    private Integer topicnum;

    @Column(name = "indexIMG")
    private String indeximg;

    @Column(name = "todayNum")
    private Integer todaynum;

    private String status;

    @Column(name = "lastPost")
    private String lastpost;

    private Integer sid;

    @Column(name = "boardUser")
    private String boarduser;

    @Column(name = "boardTopStr")
    private String boardtopstr;

    private String zf;

    private String zt;

    /**
     * @return boardId
     */
    public Integer getBoardid() {
        return boardid;
    }

    /**
     * @param boardid
     */
    public void setBoardid(Integer boardid) {
        this.boardid = boardid;
    }

    /**
     * @return boardType
     */
    public String getBoardtype() {
        return boardtype;
    }

    /**
     * @param boardtype
     */
    public void setBoardtype(String boardtype) {
        this.boardtype = boardtype;
    }

    /**
     * @return parentId
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return parentName
     */
    public String getParentname() {
        return parentname;
    }

    /**
     * @param parentname
     */
    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    /**
     * @return Depth
     */
    public Integer getDepth() {
        return depth;
    }

    /**
     * @param depth
     */
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    /**
     * @return rootId
     */
    public Integer getRootid() {
        return rootid;
    }

    /**
     * @param rootid
     */
    public void setRootid(Integer rootid) {
        this.rootid = rootid;
    }

    /**
     * @return child
     */
    public Integer getChild() {
        return child;
    }

    /**
     * @param child
     */
    public void setChild(Integer child) {
        this.child = child;
    }

    /**
     * @return orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * @param orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * @return readMe
     */
    public String getReadme() {
        return readme;
    }

    /**
     * @param readme
     */
    public void setReadme(String readme) {
        this.readme = readme;
    }

    /**
     * @return boardMaster
     */
    public String getBoardmaster() {
        return boardmaster;
    }

    /**
     * @param boardmaster
     */
    public void setBoardmaster(String boardmaster) {
        this.boardmaster = boardmaster;
    }

    /**
     * @return postNum
     */
    public Integer getPostnum() {
        return postnum;
    }

    /**
     * @param postnum
     */
    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    /**
     * @return topicNum
     */
    public Integer getTopicnum() {
        return topicnum;
    }

    /**
     * @param topicnum
     */
    public void setTopicnum(Integer topicnum) {
        this.topicnum = topicnum;
    }

    /**
     * @return indexIMG
     */
    public String getIndeximg() {
        return indeximg;
    }

    /**
     * @param indeximg
     */
    public void setIndeximg(String indeximg) {
        this.indeximg = indeximg;
    }

    /**
     * @return todayNum
     */
    public Integer getTodaynum() {
        return todaynum;
    }

    /**
     * @param todaynum
     */
    public void setTodaynum(Integer todaynum) {
        this.todaynum = todaynum;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return lastPost
     */
    public String getLastpost() {
        return lastpost;
    }

    /**
     * @param lastpost
     */
    public void setLastpost(String lastpost) {
        this.lastpost = lastpost;
    }

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return boardUser
     */
    public String getBoarduser() {
        return boarduser;
    }

    /**
     * @param boarduser
     */
    public void setBoarduser(String boarduser) {
        this.boarduser = boarduser;
    }

    /**
     * @return boardTopStr
     */
    public String getBoardtopstr() {
        return boardtopstr;
    }

    /**
     * @param boardtopstr
     */
    public void setBoardtopstr(String boardtopstr) {
        this.boardtopstr = boardtopstr;
    }

    /**
     * @return zf
     */
    public String getZf() {
        return zf;
    }

    /**
     * @param zf
     */
    public void setZf(String zf) {
        this.zf = zf;
    }

    /**
     * @return zt
     */
    public String getZt() {
        return zt;
    }

    /**
     * @param zt
     */
    public void setZt(String zt) {
        this.zt = zt;
    }
}