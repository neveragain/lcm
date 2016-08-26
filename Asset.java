package cn.oz.oa.equip.asset.domain;

import java.util.Date;
/**
 * 资产表
 * @author Administrator
 *
 */
public class Asset {
	
	private String category; // 资产类别
	private long categoryId; // 资产类别ID
	private String name; // 资产名称
	private String platform;// 所属平台
	private String code; // 资产编码
	private String tltle;// 采购项目标题
	private String address;//存放的地点
	private String unitName; // 所属单位
	private String assetsSource; // 资产来源
	private String useUnit; // 使用部门
	private String person; // 负责人
	private long projectId; // 项目标题ID
	private String projectLCID; // 支出单流程ID
	private String projectTitle; // 项目标题
	private String capitalSource; // 资金来源
	private String instrumentCode; // 仪器编码
	private String serialNumber; // 设备序列号
	private String property; // 项目类型
	private String isInfoEquip; // 是否信息化设备
	private String location; // 存放地点
	private long disciplineId; // 学科Id
	private String discipline; // 学科
	private String specifications; // 规格型号
	private Double money; // 金额
	private Double price; // 单价
	private Date leaveDate; // 出厂日期
	private Date purchaseDate; // 购买日期
	private String supplierName; // 供应商名称
	private long supplierId; // 供应商ID
	private Date inDate; // 入库日期
	private Date estimatedDate; // 预计使用到期日
	private String isCheck; // 是否参与盘点
	private String unit; // 计量单位
	private Integer assetNumber; // 装备数量
	private String isDedicated; // 是否专用设备
	private String isImportant;	//是否危险品
	private String isEnact;	//是否部颁
	private String isFixedAssets; // 是否固定资产
	private String remark; // 说明
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTltle() {
		return tltle;
	}
	public void setTltle(String tltle) {
		this.tltle = tltle;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getAssetsSource() {
		return assetsSource;
	}
	public void setAssetsSource(String assetsSource) {
		this.assetsSource = assetsSource;
	}
	public String getUseUnit() {
		return useUnit;
	}
	public void setUseUnit(String useUnit) {
		this.useUnit = useUnit;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public String getProjectLCID() {
		return projectLCID;
	}
	public void setProjectLCID(String projectLCID) {
		this.projectLCID = projectLCID;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getCapitalSource() {
		return capitalSource;
	}
	public void setCapitalSource(String capitalSource) {
		this.capitalSource = capitalSource;
	}
	public String getInstrumentCode() {
		return instrumentCode;
	}
	public void setInstrumentCode(String instrumentCode) {
		this.instrumentCode = instrumentCode;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getIsInfoEquip() {
		return isInfoEquip;
	}
	public void setIsInfoEquip(String isInfoEquip) {
		this.isInfoEquip = isInfoEquip;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getDisciplineId() {
		return disciplineId;
	}
	public void setDisciplineId(long disciplineId) {
		this.disciplineId = disciplineId;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public Date getEstimatedDate() {
		return estimatedDate;
	}
	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}
	public String getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}
	public String getIsDedicated() {
		return isDedicated;
	}
	public void setIsDedicated(String isDedicated) {
		this.isDedicated = isDedicated;
	}
	public String getIsImportant() {
		return isImportant;
	}
	public void setIsImportant(String isImportant) {
		this.isImportant = isImportant;
	}
	public String getIsEnact() {
		return isEnact;
	}
	public void setIsEnact(String isEnact) {
		this.isEnact = isEnact;
	}
	public String getIsFixedAssets() {
		return isFixedAssets;
	}
	public void setIsFixedAssets(String isFixedAssets) {
		this.isFixedAssets = isFixedAssets;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
