package page;

import java.util.List;
import java.util.stream.Collectors;

public class PageUtil<T> {
    /**
     * 实体类列表
     */
    List<T> content;
    /**
     * 是否首页
     */
    boolean first;
    /**
     * 是否尾页
     */
    boolean last;
    /**
     * 总记录数
     */
    Integer totalElements;
    /**
     * 总页数
     */
    Integer totalPages;

    Integer numberOfElements;
    /**
     * 每页记录数
     */
    Integer size;
    /**
     * 当前页
     */
    Integer number;

    @Override
    public String toString() {
        return "PageUtil{" +
                "content=" + content +
                ", first=" + first +
                ", last=" + last +
                ", totalElements=" + totalElements +
                ", totalPages=" + totalPages +
                ", numberOfElements=" + numberOfElements +
                ", size=" + size +
                ", number=" + number +
                '}';
    }

    public List<T> getContent() {
        return content;
    }

    public boolean isFirst() {
        return first;
    }

    public boolean isLast() {
        return last;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getNumber() {
        return number;
    }

    public void pageUtil(Integer page, Integer size, List<T> list){
        List<T> list1=list.stream ().skip (page*size).limit (size).collect(Collectors.toList());
        int length=list.size ();
        this.first=(page==0);
        this.last= (page==(length-1)/size);
        this.totalPages =((length-1)/size+1);
        this.totalElements= (length);
        this.size= (size);
        this.content= (list1);
        this.numberOfElements =(list1.size ());
        this.number= (page);
    }
}
