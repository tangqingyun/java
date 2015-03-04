package cn.blogs.commons;
import java.util.Collections;
import java.util.List;

public class Page<E> {
	/** 表示分页中的一页。 */
	private boolean hasPre; // 是否有上一页
	private boolean hasNext; // 是否有下一页
	private List<E> items; // 当前页包含的记录列表
	private int index; // 当前页页码(起始为1)

	// 省略setter
	public int getIndex() {
		return this.index;
	}

	public boolean isHasPre() {
		return this.hasPre;
	}

	public boolean isHasNext() {
		return this.hasNext;
	}

	public List<E> getItems() {
		return this.items == null ? Collections.<E> emptyList() : this.items;
	}
}
