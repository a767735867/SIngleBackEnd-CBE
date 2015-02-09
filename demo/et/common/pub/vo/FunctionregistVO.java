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
 * Functionregist的VO类。
 * 
 * 创建日期：(2015-2-9)
 * @author：
 */
public class FunctionregistVO extends SuperVO {

	private String fun_id;
	private String fun_code;
	private String fun_name;
	private String fun_url;
	private String fun_property;
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
public FunctionregistVO() {

}
/**
 * 使用主键进行初始化的构造子。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_id 主键值
 */
public FunctionregistVO(String newFun_id) {

	// 为主键字段赋值:
	fun_id = newFun_id;
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
	FunctionregistVO functionregist = (FunctionregistVO)o;

	// 你在下面复制本VO对象的所有属性：

	return functionregist;
}
/**
 * 返回数据对象的显示名称。
 *
 * 创建日期：(2015-2-9)
 * @return java.lang.String 返回数据对象的显示名称。
 */
public String getEntityName() {

	return "Functionregist";
}
/**
 * 返回对象标识，用来唯一定位对象。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getPrimaryKey() {

	return fun_id;
}
/**
 * 设置对象标识，用来唯一定位对象。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_id String 
 */
public void setPrimaryKey(String newFun_id) {

	fun_id = newFun_id;
}
/**
 * 属性fun_id的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getFun_id() {
	return fun_id;
}
/**
 * 属性fun_code的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getFun_code() {
	return fun_code;
}
/**
 * 属性fun_name的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getFun_name() {
	return fun_name;
}
/**
 * 属性fun_url的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getFun_url() {
	return fun_url;
}
/**
 * 属性fun_property的Getter方法。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getFun_property() {
	return fun_property;
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
 * 属性fun_id的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_id String
 */
public void setFun_id(String newFun_id) {

	fun_id = newFun_id;
}
/**
 * 属性fun_code的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_code String
 */
public void setFun_code(String newFun_code) {

	fun_code = newFun_code;
}
/**
 * 属性fun_name的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_name String
 */
public void setFun_name(String newFun_name) {

	fun_name = newFun_name;
}
/**
 * 属性fun_url的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_url String
 */
public void setFun_url(String newFun_url) {

	fun_url = newFun_url;
}
/**
 * 属性fun_property的setter方法。
 *
 * 创建日期：(2015-2-9)
 * @param newFun_property String
 */
public void setFun_property(String newFun_property) {

	fun_property = newFun_property;
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
	if (fun_id == null) {
		errFields.add(new String("fun_id"));
	}
	if (fun_code == null) {
		errFields.add(new String("fun_code"));
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

	return "functionregist";
}
/**
 * 返回数据表对应的主键字段名字。
 *
 * 创建日期：(2015-2-9)
 * @return String
 */
public String getPKFieldName() {

	return "fun_id";
}
}