//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 10:49:44 AM CEST 
//

package eu.europa.emsa.csndc;

import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the eu.europa.emsa.csndc package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Identifier_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "identifier");

    private final static QName _ProcessRequest_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "processRequest");

    private final static QName _DetectedShipReference_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "detectedShipReference");

    private final static QName _DetectedShips_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "detectedShips");

    private final static QName _Ship_QNAME = new QName("http://www.emsa.europa.eu/csndc", "Ship");

    private final static QName _QualityReport_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "qualityReport");

    private final static QName _SarDerivedData_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "sarDerivedData");

    private final static QName _FileName_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "fileName");

    private final static QName _PackageInfo_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "packageInfo");

    private final static QName _OilSpill_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "OilSpill");

    private final static QName _QualityNotification_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "qualityNotification");

    private final static QName _SarDerivedDataReference_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "sarDerivedDataReference");

    private final static QName _OilSpillReference_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "oilSpillReference");

    private final static QName _DataPackage_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "dataPackage");

    private final static QName _OilSpills_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "oilSpills");

    private final static QName _EoProduct_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "eoProduct");

    private final static QName _ShipTypeHeading_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "heading");

    private final static QName _ShipTypePositionAccuracyVector_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "positionAccuracyVector");

    private final static QName _ShipTypeShipThumbnail_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "shipThumbnail");

    private final static QName _ShipTypeConfidenceLevel_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "confidenceLevel");

    private final static QName _ShipTypeLength_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "length");

    private final static QName _ShipTypeId_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "id");

    private final static QName _ShipTypeIncludeInReport_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "includeInReport");

    private final static QName _ShipTypeWidthError_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "widthError");

    private final static QName _ShipTypeLengthError_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "lengthError");

    private final static QName _ShipTypeDetectionParameters_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "detectionParameters");

    private final static QName _ShipTypeWidth_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "width");

    private final static QName _ShipTypeSpeed_QNAME = new QName("http://www.emsa.europa.eu/csndc",
            "speed");

    private final static QName _ShipTypeTimeStamp_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "timeStamp");

    private final static QName _ShipTypeImageIdentifier_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "imageIdentifier");

    private final static QName _LocationClassificationTypeCountry_QNAME = new QName(
            "http://www.emsa.europa.eu/csndc", "country");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.emsa.csndc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaType }
     * 
     */
    public AreaType createAreaType() {
        return new AreaType();
    }

    /**
     * Create an instance of {@link AuxiliaryDataReferenceArrayType }
     * 
     */
    public AuxiliaryDataReferenceArrayType createAuxiliaryDataReferenceArrayType() {
        return new AuxiliaryDataReferenceArrayType();
    }

    /**
     * Create an instance of {@link AuxiliaryDataReferenceType }
     * 
     */
    public AuxiliaryDataReferenceType createAuxiliaryDataReferenceType() {
        return new AuxiliaryDataReferenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataPackageType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "dataPackage")
    public JAXBElement<DataPackageType> createDataPackage(DataPackageType value) {
        return new JAXBElement<DataPackageType>(_DataPackage_QNAME, DataPackageType.class, null,
                value);
    }

    /**
     * Create an instance of {@link DataPackageType }
     * 
     */
    public DataPackageType createDataPackageType() {
        return new DataPackageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectedShipReferenceType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "detectedShipReference")
    public JAXBElement<DetectedShipReferenceType> createDetectedShipReference(
            DetectedShipReferenceType value) {
        return new JAXBElement<DetectedShipReferenceType>(_DetectedShipReference_QNAME,
                DetectedShipReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link DetectedShipReferenceType }
     * 
     */
    public DetectedShipReferenceType createDetectedShipReferenceType() {
        return new DetectedShipReferenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectedShipsType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "detectedShips")
    public JAXBElement<DetectedShipsType> createDetectedShips(DetectedShipsType value) {
        return new JAXBElement<DetectedShipsType>(_DetectedShips_QNAME, DetectedShipsType.class,
                null, value);
    }

    /**
     * Create an instance of {@link DetectedShipsType }
     * 
     */
    public DetectedShipsType createDetectedShipsType() {
        return new DetectedShipsType();
    }

    /**
     * Create an instance of {@link DetectionParametersType }
     * 
     */
    public DetectionParametersType createDetectionParametersType() {
        return new DetectionParametersType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EOProductType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "eoProduct")
    public JAXBElement<EOProductType> createEoProduct(EOProductType value) {
        return new JAXBElement<EOProductType>(_EoProduct_QNAME, EOProductType.class, null, value);
    }

    /**
     * Create an instance of {@link EOProductType }
     * 
     */
    public EOProductType createEOProductType() {
        return new EOProductType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "fileName")
    public JAXBElement<String> createFileName(String value) {
        return new JAXBElement<String>(_FileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "identifier")
    public JAXBElement<String> createIdentifier(String value) {
        return new JAXBElement<String>(_Identifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link InSituInformationType }
     * 
     */
    public InSituInformationType createInSituInformationType() {
        return new InSituInformationType();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link LocationClassificationType }
     * 
     */
    public LocationClassificationType createLocationClassificationType() {
        return new LocationClassificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "country", scope = LocationClassificationType.class)
    public JAXBElement<String> createLocationClassificationTypeCountry(String value) {
        return new JAXBElement<String>(_LocationClassificationTypeCountry_QNAME, String.class,
                LocationClassificationType.class, value);
    }

    /**
     * Create an instance of {@link MeteoConditionsType }
     * 
     */
    public MeteoConditionsType createMeteoConditionsType() {
        return new MeteoConditionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OilSpillType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "OilSpill", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<OilSpillType> createOilSpill(OilSpillType value) {
        return new JAXBElement<OilSpillType>(_OilSpill_QNAME, OilSpillType.class, null, value);
    }

    /**
     * Create an instance of {@link OilSpillCompositionType }
     * 
     */
    public OilSpillCompositionType createOilSpillCompositionType() {
        return new OilSpillCompositionType();
    }

    /**
     * Create an instance of {@link OilSpillExtensionType }
     * 
     */
    public OilSpillExtensionType createOilSpillExtensionType() {
        return new OilSpillExtensionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OilSpillReferenceType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "oilSpillReference")
    public JAXBElement<OilSpillReferenceType> createOilSpillReference(OilSpillReferenceType value) {
        return new JAXBElement<OilSpillReferenceType>(_OilSpillReference_QNAME,
                OilSpillReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link OilSpillReferenceType }
     * 
     */
    public OilSpillReferenceType createOilSpillReferenceType() {
        return new OilSpillReferenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OilSpillsType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "oilSpills")
    public JAXBElement<OilSpillsType> createOilSpills(OilSpillsType value) {
        return new JAXBElement<OilSpillsType>(_OilSpills_QNAME, OilSpillsType.class, null, value);
    }

    /**
     * Create an instance of {@link OilSpillsType }
     * 
     */
    public OilSpillsType createOilSpillsType() {
        return new OilSpillsType();
    }

    /**
     * Create an instance of {@link OilSpillType }
     * 
     */
    public OilSpillType createOilSpillType() {
        return new OilSpillType();
    }

    /**
     * Create an instance of {@link OrientationType }
     * 
     */
    public OrientationType createOrientationType() {
        return new OrientationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageInfoType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "packageInfo")
    public JAXBElement<PackageInfoType> createPackageInfo(PackageInfoType value) {
        return new JAXBElement<PackageInfoType>(_PackageInfo_QNAME, PackageInfoType.class, null,
                value);
    }

    /**
     * Create an instance of {@link PackageInfoType }
     * 
     */
    public PackageInfoType createPackageInfoType() {
        return new PackageInfoType();
    }

    /**
     * Create an instance of {@link PositionAccuracyVectorType }
     * 
     */
    public PositionAccuracyVectorType createPositionAccuracyVectorType() {
        return new PositionAccuracyVectorType();
    }

    /**
     * Create an instance of {@link PossibleSourcesType }
     * 
     */
    public PossibleSourcesType createPossibleSourcesType() {
        return new PossibleSourcesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "processRequest")
    public JAXBElement<ProcessRequestType> createProcessRequest(ProcessRequestType value) {
        return new JAXBElement<ProcessRequestType>(_ProcessRequest_QNAME, ProcessRequestType.class,
                null, value);
    }

    /**
     * Create an instance of {@link ProcessRequestType }
     * 
     */
    public ProcessRequestType createProcessRequestType() {
        return new ProcessRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "qualityNotification")
    public JAXBElement<QualityType> createQualityNotification(QualityType value) {
        return new JAXBElement<QualityType>(_QualityNotification_QNAME, QualityType.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "qualityReport")
    public JAXBElement<QualityType> createQualityReport(QualityType value) {
        return new JAXBElement<QualityType>(_QualityReport_QNAME, QualityType.class, null, value);
    }

    /**
     * Create an instance of {@link QualityType }
     * 
     */
    public QualityType createQualityType() {
        return new QualityType();
    }

    /**
     * Create an instance of {@link RelatedEventsType }
     * 
     */
    public RelatedEventsType createRelatedEventsType() {
        return new RelatedEventsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SARDerivedDataType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "sarDerivedData")
    public JAXBElement<SARDerivedDataType> createSarDerivedData(SARDerivedDataType value) {
        return new JAXBElement<SARDerivedDataType>(_SarDerivedData_QNAME, SARDerivedDataType.class,
                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SARDerivedDataReferenceType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "sarDerivedDataReference")
    public JAXBElement<SARDerivedDataReferenceType> createSarDerivedDataReference(
            SARDerivedDataReferenceType value) {
        return new JAXBElement<SARDerivedDataReferenceType>(_SarDerivedDataReference_QNAME,
                SARDerivedDataReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link SARDerivedDataReferenceType }
     * 
     */
    public SARDerivedDataReferenceType createSARDerivedDataReferenceType() {
        return new SARDerivedDataReferenceType();
    }

    /**
     * Create an instance of {@link SARDerivedDataType }
     * 
     */
    public SARDerivedDataType createSARDerivedDataType() {
        return new SARDerivedDataType();
    }

    /**
     * Create an instance of {@link SeaConditionType }
     * 
     */
    public SeaConditionType createSeaConditionType() {
        return new SeaConditionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "Ship", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<ShipType> createShip(ShipType value) {
        return new JAXBElement<ShipType>(_Ship_QNAME, ShipType.class, null, value);
    }

    /**
     * Create an instance of {@link ShipType }
     * 
     */
    public ShipType createShipType() {
        return new ShipType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "confidenceLevel", scope = ShipType.class)
    public JAXBElement<Double> createShipTypeConfidenceLevel(Double value) {
        return new JAXBElement<Double>(_ShipTypeConfidenceLevel_QNAME, Double.class,
                ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectionParametersType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "detectionParameters", scope = ShipType.class)
    public JAXBElement<DetectionParametersType> createShipTypeDetectionParameters(
            DetectionParametersType value) {
        return new JAXBElement<DetectionParametersType>(_ShipTypeDetectionParameters_QNAME,
                DetectionParametersType.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "heading", scope = ShipType.class)
    public JAXBElement<BigInteger> createShipTypeHeading(BigInteger value) {
        return new JAXBElement<BigInteger>(_ShipTypeHeading_QNAME, BigInteger.class,
                ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "id", scope = ShipType.class)
    public JAXBElement<String> createShipTypeId(String value) {
        return new JAXBElement<String>(_ShipTypeId_QNAME, String.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "imageIdentifier", scope = ShipType.class)
    public JAXBElement<ImageType> createShipTypeImageIdentifier(ImageType value) {
        return new JAXBElement<ImageType>(_ShipTypeImageIdentifier_QNAME, ImageType.class,
                ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "includeInReport", scope = ShipType.class, defaultValue = "false")
    public JAXBElement<Boolean> createShipTypeIncludeInReport(Boolean value) {
        return new JAXBElement<Boolean>(_ShipTypeIncludeInReport_QNAME, Boolean.class,
                ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "length", scope = ShipType.class)
    public JAXBElement<Double> createShipTypeLength(Double value) {
        return new JAXBElement<Double>(_ShipTypeLength_QNAME, Double.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "lengthError", scope = ShipType.class)
    public JAXBElement<Double> createShipTypeLengthError(Double value) {
        return new JAXBElement<Double>(_ShipTypeLengthError_QNAME, Double.class, ShipType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionAccuracyVectorType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "positionAccuracyVector", scope = ShipType.class)
    public JAXBElement<PositionAccuracyVectorType> createShipTypePositionAccuracyVector(
            PositionAccuracyVectorType value) {
        return new JAXBElement<PositionAccuracyVectorType>(_ShipTypePositionAccuracyVector_QNAME,
                PositionAccuracyVectorType.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "shipThumbnail", scope = ShipType.class)
    public JAXBElement<String> createShipTypeShipThumbnail(String value) {
        return new JAXBElement<String>(_ShipTypeShipThumbnail_QNAME, String.class, ShipType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "speed", scope = ShipType.class)
    public JAXBElement<Double> createShipTypeSpeed(Double value) {
        return new JAXBElement<Double>(_ShipTypeSpeed_QNAME, Double.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "timeStamp", scope = ShipType.class)
    public JAXBElement<XMLGregorianCalendar> createShipTypeTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShipTypeTimeStamp_QNAME,
                XMLGregorianCalendar.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "width", scope = ShipType.class)
    public JAXBElement<Double> createShipTypeWidth(Double value) {
        return new JAXBElement<Double>(_ShipTypeWidth_QNAME, Double.class, ShipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.emsa.europa.eu/csndc", name = "widthError", scope = ShipType.class)
    public JAXBElement<Double> createShipTypeWidthError(Double value) {
        return new JAXBElement<Double>(_ShipTypeWidthError_QNAME, Double.class, ShipType.class,
                value);
    }

    /**
     * Create an instance of {@link SlickTechParametersType }
     * 
     */
    public SlickTechParametersType createSlickTechParametersType() {
        return new SlickTechParametersType();
    }

    /**
     * Create an instance of {@link SlickTechParameterType }
     * 
     */
    public SlickTechParameterType createSlickTechParameterType() {
        return new SlickTechParameterType();
    }

    /**
     * Create an instance of {@link WindConditionType }
     * 
     */
    public WindConditionType createWindConditionType() {
        return new WindConditionType();
    }

}