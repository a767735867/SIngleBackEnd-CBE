/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for ET product.                              *
\***************************************************************/

package et.common.pub.vo;

import java.util.List;
import java.util.ArrayList;
import et.common.vo.base.*;
import et.common.vo.lang.*;
/**
 * Dept的VO类。
 * 
 * 创建日期：(2015-2-9)
 * @author：
 */
public class DeptVO extends SuperVO {

	private String dept_id;
	private String dept_code;
	private String dept_name;
	private String dept_desc;
	private String temp_var1;
	private String temp_var2;
	private String temp_var3;
	private Integer temp_int1;
	private Integer temp_int2;
	private Integer temp_int3;
	private String corp_id;
	private UFDateTime ts;
/**
 * 默认的构造子。
 *
 * 创建日期：(2015-2-9)
 */
public DeptVO() {

}
/**
 * 使用主键进行初始化的构造子。
 *
 * 创建日期：(2015-2-9)
 * @param newDept_id 主键值
 */
public DeptVO(String newDept_id) {

	// 为主键字段赋值:
	dept_id = newDept_id;
}
/**
 * 根类Object的方法,克隆这个VO对象。
 *
 * 创建日期：(2015-2-9)
 */
public Object clone() {

	// 复制基类内容并创建新的VO对象：
	Object o = null;
	try {
		o = super.clone();
	} catch (Exception e) {}
	DeptVO dept = (DeptVO)o;

	// 你在下面复制本VO对象的所有属性：

	return dept;
}
/**
 * 返回数据对象的显示名称。
 *
 * 创建日期：(2015-2-9)
 * @return java.lang.String 返回数据对象的显示名称。
 */
public String getEntityName() {

	return "Dept";
}
/**
 * 返回对象标识，用来唯一定位对象。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getPrimaryKey() {

	return dept_id;
}
/**
 * 设置对象标识，用来唯一定位对象。
 *
 * 创建日期：(2015-2-9)
 * @param newDept_id String 
 */
public void setPrimaryKey(String newDept_id) {

	dept_id = newDept_id;
}
/**
 * 属性dept_id的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getDept_id() {
	return dept_id;
}
/**
 * 属性dept_code的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getDept_code() {
	return dept_code;
}
/**
 * 属性dept_name的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getDept_name() {
	return dept_name;
}
/**
 * 属性dept_desc的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getDept_desc() {
	return dept_desc;
}
/**
 * 属性temp_var1的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getTemp_var1() {
	return temp_var1;
}
/**
 * 属性temp_var2的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getTemp_var2() {
	return temp_var2;
}
/**
 * 属性temp_var3的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getTemp_var3() {
	return temp_var3;
}
/**
 * 属性temp_int1的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return Integer
 */
public Integer getTemp_int1() {
	return temp_int1;
}
/**
 * 属性temp_int2的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return Integer
 */
public Integer getTemp_int2() {
	return temp_int2;
}
/**
 * 属性temp_int3的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return Integer
 */
public Integer getTemp_int3() {
	return temp_int3;
}
/**
 * 属性corp_id的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getCorp_id() {
	return corp_id;
}
/**
 * 属性ts的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return UFDateTime
 */
public UFDateTime getTs() {
	return ts;
}
/**
 * 属性dept_id的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newDept_id String
 */
public void setDept_id(String newDept_id) {

	dept_id = newDept_id;
}
/**
 * 属性dept_code的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newDept_code String
 */
public void setDept_code(String newDept_code) {

	dept_code = newDept_code;
}
/**
 * 属性dept_name的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newDept_name String
 */
public void setDept_name(String newDept_name) {

	dept_name = newDept_name;
}
/**
 * 属性dept_desc的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newDept_desc String
 */
public void setDept_desc(String newDept_desc) {

	dept_desc = newDept_desc;
}
/**
 * 属性temp_var1的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTemp_var1 String
 */
public void setTemp_var1(String newTemp_var1) {

	temp_var1 = newTemp_var1;
}
/**
 * 属性temp_var2的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTemp_var2 String
 */
public void setTemp_var2(String newTemp_var2) {

	temp_var2 = newTemp_var2;
}
/**
 * 属性temp_var3的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTemp_var3 String
 */
public void setTemp_var3(String newTemp_var3) {

	temp_var3 = newTemp_var3;
}
/**
 * 属性temp_int1的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTemp_int1 Integer
 */
public void setTemp_int1(Integer newTemp_int1) {

	temp_int1 = newTemp_int1;
}
/**
 * 属性temp_int2的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTemp_int2 Integer
 */
public void setTemp_int2(Integer newTemp_int2) {

	temp_int2 = newTemp_int2;
}
/**
 * 属性temp_int3的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTemp_int3 Integer
 */
public void setTemp_int3(Integer newTemp_int3) {

	temp_int3 = newTemp_int3;
}
/**
 * 属性corp_id的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newCorp_id String
 */
public void setCorp_id(String newCorp_id) {

	corp_id = newCorp_id;
}
/**
 * 属性ts的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newTs UFDateTime
 */
public void setTs(UFDateTime newTs) {

	ts = newTs;
}
/**
 * 验证对象各属性之间的数据逻辑正确性。
 *
 * 创建日期：(2015-2-9)
 * @exception nc.vo.pub.ValidationException 如果验证失败，抛出
 *     ValidationException，对错误进行解释。
 */
public void validate() throws ValidationException {

	ArrayList<String> errFields = new ArrayList<String>(); 
	// 检查是否为不允许空的字段赋了空值，你可能需要修改下面的提示信息：
	if (dept_id == null) {
		errFields.add(new String("dept_id"));
	}
	if (dept_code == null) {
		errFields.add(new String("dept_code"));
	}
	// construct the exception message:
	StringBuffer message = new StringBuffer();
	message.append("下列字段不能为空：");
	if (errFields.size() > 0) {
		String[] temp = (String[]) errFields.toArray(new String[0]);
		message.append(temp[0]);
		for ( int i= 1; i < temp.length; i++ ) {
			message.append("、");
			message.append(temp[i]);
		}
		// throw the exception:
		throw new NullFieldException(message.toString());
	}
}
/**
 * 返回表头主键字段,用来进行主子表关联,需要手工修改。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getParentPKFieldName() {

	return null;
}
/**
 * 返回外键关联集合,用来进行关联查询,需要手工修改。
 *
 * 创建日期：(2015-2-9)
 * @return List
 */
public List<String> getForeignRelation(){

	return null;
}
/**
 * 返回VO对应的数据表名字
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getTableName() {

	return "dept";
}
/**
 * 返回数据表对应的主键字段名字。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getPKFieldName() {

	return "dept_id";
}
}