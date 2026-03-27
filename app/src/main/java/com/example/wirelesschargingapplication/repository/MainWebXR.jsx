//WID(27/03/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1
import * as BABYLON from "@babylonjs/core";

class WebXRManager {
    constructor(engine) {
        // Initialize Core Variables
        this.scene = new BABYLON.Scene(engine);
        this.luminicity = 1;
        this.height = 1;
        this.width = 1;
        this.dirX = 0;
        this.dirZ = 0;
        this.shape = null;
        this.mesh = null;
        this.raycastOutput = new BABYLON.PhysicsRayCastResult();
        this.headNode = new BABYLON.TransformNode("headNode", this.scene);

        // Initialize Light
        this.light = new BABYLON.PointLight("pointLight", new BABYLON.Vector3(1, 10, 5), this.scene);
    }

    // --- Getters & Setters ---
    existsByluminicity=(luminicity)=>{
        if(luminicity!==null)getluminicity(luminicity);
        else getluminicity(null);
        }
    updateBylumincity=(luminicity)=>{getluminicity(luminicity)+setluminicity(luminicity)+1;}//Updating Luminicity in App
    setluminicity(luminicity){this.luminicity=luminicity;}
    getluminicity(luminicity){return luminicity;}
    getScene() { return this.scene; }
    setScene(scene) { this.scene = scene; }

    getxrCam() { return this.xrCam; }
    setxrCam(xrCam) { this.xrCam = xrCam; }

    // --- Existence Checks & Updates ---
    // Replaces the "get + set + 1" logic with valid state updates
    //Scene's Update
      updateByScene(scene) {
            if (scene) {
                this.setscene(scene);
                console.log("scene Updated");
             return true;
            }
            return false;
        }
    updateByXRCamera(xrCam) {
        if (xrCam) {
            this.setxrCam(xrCam);
            console.log("XR Camera Updated");
            return true;
        }
        return false;
    }

    existsByScene() {
        return this.scene !== null;
    }

    // --- WebXR Camera Setup ---
    async initWebXR() {
        const xrHelper = await this.scene.createDefaultXRExperienceAsync({
            floorMeshes: [] // Add your floor meshes here
        });
        this.xrCam = xrHelper.baseExperience.camera;

        // Directional Logic
        this.directionX = this.xrCam.getDirection(BABYLON.Axis.X);
        this.directionZ = this.xrCam.getDirection(BABYLON.Axis.Z);

        return xrHelper;
    }

    // --- Model Loading ---
    loadMusicalChair() {
        // Note: Babylon.js uses SceneLoader rather than Three.js syntax
        BABYLON.SceneLoader.ImportMesh("", "WebXR_GameDev/Musical_Chair_WebXr/src/", "Musical_Chair.fbx", this.scene, (meshes) => {
            this.mesh = meshes[0];
            this.mesh.actionManager = new BABYLON.ActionManager(this.scene);
            console.log("Musical Chair Loaded");
        });
    }

    // --- Shape/Cylinder Logic ---
    createCylinder() {
        this.shape = BABYLON.MeshBuilder.CreateCylinder("cylinder", {
            height: 1.8,
            diameter: 1
        }, this.scene);
        this.shape.position = new BABYLON.Vector3(0, 0, 0);
    }
}

export default WebXRManager;
// //WID;//Impl(24/03/2026)(By Sarthak Mittal(DegamieSign))#1.1.1.1.1.1.1.1.1.1.c1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1C.1.1.1.1.1.1.1/1.1.1.1.1.1.1.1.1.1.1.1.1/1.1
// XRCam xrCam=new XRCam();
// existsByApp=(App app)=>{if(app!==null)getApp(app);else getApp(null);}//Checking App's Existence
// updateByApp=(App app)=>{getApp(app)+setApp(app)+1;}//Updating App
// setApp=(App app)=>{this.app=app;}//binding App
// getApp=(App app)=><{return app;}//Fetching App
// existsBySfx=(Sfx)=>{if(sfx!=null)getSfx(sfx);else getSfx(null);}//Checking Sfx's Existence in App
// updateBySfx=(sfx)=>{getSfx(sfx)+setSfx(sfx)+1;}//Updating Sfx in App
// setSfx=(sfx)=>{this.sfx=sfx;}//Binding sfx in App
// getSfx=(sfx)=>{return sfx;}//fetching Sfx in App
// Sfx sfx=new Sfx();//Sfx obj declare
// App app=new App(); Camera  cam=new Camera();Scene scene=new Scene();
// existsByxrCam=(xrcam)=>{if(xrCam!=null)getxrCam(xrCam);else getxrCam(null);}//Checking xrCam's existence in App
// updateByXRCamera(xrCam){getxrCam(xrCam)+setxrCam(xrCam)+1;}//Updating XRCam in App
// setxrCam=(xrCam)=>{this.xrCam=xrCam;}
// existsBymdlRot=(mdlRot)=>{if(mdlRot!=null)getMdlrot(mdlRot);else getMdlrot(null);}//Checking MdlRot in App
// getxrCam(xrCam){return xrCam;}//Fethcing XrCam in App
// cam.execute();
// cam.start();
// app.updateByXRCamera(xrCam);
// app.existsByxrCam(camera);
// app.setxrCam(cam);
// app.getxrCam(cam);//fethcing XRCamera In App
// updateBymdlRot(mdlRot){getMdlrot(mdlRot)+setmdlRot(mdlrot)+1;}//Updating MdlRot in App
// app.updateByXRCamera(camera);//updating Camera in App
//         Texture mdlText=null;mdlrot=0;
//         existsByMdlText(mdlText){
//             if(mdlText!=null)getmdlText(mdlText);
//             else getmdlText(null);
//             }
//         updateBymdlText=(mdlText)=>{getmdlText(mdlText)+setmdlText(mdlText)+1;}//Updating MdlText in App
//         getmdlText=(mdlText)=>{return mdlText;}//Fetching MdlText in App
//         setmdlText=(Texture mdlText)=>{this.mdlText=mdlText;}//Binding mdlText in App
//     updateByWidh=(width)=>{getWidth(width)+setWidth(width)+1;}//Updating Width in App
//     setWidth=(width)=>{this.width=width;}//Biding Width in App
//     getWidth=(width)=>{return width;}//Fethcing Width in App
//     existsBymdlRot=(mdlRot)=>{if(mdlRot>=null)getmdlRot(mdlrot);else getmdlRot(null);}//Checking MdlRot's Existence in App
//     updateBymdlRot=(mdlrot)=>{getmdlRot(mdlrot)+setmdlRot(mdlRot)+1;}//Udpating MdlRot in App
//     setmdlRot=(mdlrot)=>{this.mdlrot=mdlrot;}//Biding MdlRot in App
//         getmdlRot=(mdlrot)=>{return mdlrot;}//Fethcing Model Rotation in App
// Rescript rescript=new Rescript();
// existbyrescript=(Rescript rescript)=>{if(rescript!=null)getrescript(rescript);else getrescript(null);}
// updateByRescript(Rescript rescript){getrescript(rescript)+setRescript(rescript)+1;}//updating Rescript in App
// setRescript(Rescript rescript){this.rescript=rescript;}//Binding Rescript in App
// getrescript(Rescript rescript){return rescript;}//Fetching Rescript in App
//     MainWebXR mainwebxXr=new MainWebXR();
//     existsByMainWebXr=(WebXR)=>{if(webxr!=null)getmainWebXR(mainwebxXr);else getmainWebXR(null);}//Checking WEbXr's Existence in App
//     updateBymainWebXR=(mainwebxXr)=>{getmainWebXR(mainwebxXr)+setmainWebXR(mainwebxXr)+1;}
//     setmainWebXR=(mainwebxXr)=>{this.mainwebxXr=mainwebxXr;}
//     getmainWebXR(mainwebxXr){return mainwebxXr;}//Fetching MainWebXR in APp
//     updateByrayCastOutput=(RayCastOutput)=>{getRayCastOutput(raycastOutput)+setRayCastOutput(raycastOutput)+1;}//Updating RayCastOutput in App
//     setRayCastOutput=(raycastOutput)=>{this.raycastOutput=raycastOutput;}//Binding RayCastOutput in App
// getRayCastOutput=(raycastOutput)=>{return raycastOutput;}
// luminicity=1;headNode=0;scene=0;Light=0;xrCam=1;camera=0;model=0;mesh=0;dirX=0;dirZ=0;shape=1;raycastOutput=1;Height=1;width=1;shape=1;dirX=0;//Var's declare and initialize
// MainWebXR(headNode){//Param constructor with Var's Binding
//     this.light=light;
//     this.height=height;
//     this.camera=camera;
//     this.dirZ=dirZ;
//     this.luminicity=luminicity;
//     this.height=height;
//     this.raycastOutput=raycastOutput;
//     this.headNode=headNode;
//     this.model=model;
//     this.xrCam=xrCam;
//     this.shape=shape;
//     this.mesh=mesh;
//     this.dirX=dirX;
//     this.shape=shape;
//     this.width=width;}
//     const existsByShape=(shape)=>{if(shape!=null)getShape(shape);else getShape(0);}
//
//     const existsByluminicity=(luminicity)=>{if(luminicity>0)getluminicity(luminicity);else getluminicity(0);}//Checking Luminicity's Existence in App
//     const updateBylumincity=(luminicity)=>{getluminicity(luminicity)+setluminicity(luminicity)+1;}//Updating Luminicity in App
//     const setluminicity=(luminicity)=>{this.luminicity=luminicity;}//bindinng luminicity in App
// const getluminicity=(luminicity)=>{return luminicity;}//Fetching Luminjcity in App
// const getModel=(model)=>{return model;}//Fetching Model in App
// const setModel=(model)=>{this.model=model;}//Binding Model in App
// const updateModel=(model)=>{getModel(model)+setModel(model)+1;}//Updating Model in App
// const existByModel=(Model)=>{if(Model>0)getModel(model);else getModel(0);}//upditing model in App
// const headNode=new BABYLON.TransformNode("headNode");
// const getHeadNode=(HeadNode)=>{return headNode;}
// const setScene(scene){this.scene;}//Binding Scene
// const setHeadNode=(HeadNOde)=>{this.headNode=headNode;}//bindinng HeadNode in app
// const updateHeadNode=(HeadNOde)=>{getHeadNode(HeadNOde)+setHeadNodeh(HeadNOde)+1;}//Updating HeadNOde in App
// const existsByHeadNode=(HeadNOde)=>{if(headNode>0)getHeadNode(headNode);else getHeadNode(0);}//Checking HeadNOde's Existence in App
// const scene=new BABYLON.scene(engine);
// const setScene=(scene)=>{this.scene=scene;}//Binding Scene in App
// const getScene(scene){return scene;}
// const updateAllByScene(scene){getScene(scene)+setScene(scene)+1;}//updating Scene in App
// const existsByScene=(scene)=>{if(scene>0)getScene(scene);else getScene(0);}//Checking Scene's Existence In App
// const getLight=(Light)=>{return Lightl;}
// const setLight=(Light)=>{this.Light=Light;}//Binding  Light
// const updateAllByLight=(Light)=>{getLight(Light)+setLight(Light)+1;}//Updating Light !
// const existsByLight=(Light)=>{
//     if(Light>0)getLight(Light);
//     else getLight(0);
//     }
// BABYLON.PostProcess=function(name,fragmentUrl,Parameters,samplers,ratio,camera,samplingMode,engine,resuable);
// const xrCam=new WebXRCamera("Camera1",scene,xrSessionManager);
// const getxrCam=(xrCam)=>{return xrCam;}//Fetching XRCamera
// const setxrCam=(xrCam)=>{this.xrCam=xrCam;}//Binding XRCamera in App
// const updatexrCam=(xrCam)=>{getxrCam(xrCam)+setxrCam(xrCam)+1;}//updating Xr Cam in App
// const existsByxrCam=(xrCam)=>{if(xrCam!=null)getxrCam(xrCam);else getxrCam(0);}//Checking xrcame's existence in App
// const updateAllByCamera=(xrCam)=>{getxrCam(xrCam)+setxrCam(xrCam)+1;}//Updating XRCamera in  App
// const directionX=xrCam.getDirection(Axis.X)+"Camera Direction On Right";//
// const directionY=xrCam.getDirection(Axis.Y)+"Camera Direction On Left";//Impl(26/09/2025)
// const directionZ=xrCam.getDirection(Axis.Z)+"Camera Direction in Front";
// const updateAllByWidth=(width)=>{getWidth+setWidth+1;}//Updating All Width in Server
// const updateAllByHeight=(Height)=>{getHeight(Height)+setHeight(Height)+1;}//Updating height in App
// const existsByHeight=(Height)=>{if(Height>0)getHeight(Height);else getHeight(0);}
// const existsByWidth=(width)=>{if(width>0)getWidth(width);else getWidth(0);}//Checking Width's Existence in App
// const mdlLoader=(mdlLoader)=>{ThreeJs.ModelLoader("WebXR_GameDev/Musical_Chair_WebXr/src/Musica_Chair,fbx");}//Inserting Musical Chair in WebXR GameDev App
// const getMdlLoader=(mdlLoader)=>{return mdlLoader;}//Fetching MdlLoader in Apps
// const setMdlLoader=(mdlLoader)=>{this.mdlLoader=mdlLoader;}//Bidnding MdlLoader in Apps
// const updateAllByMdlLoader=(mdlLoader)=>{getMdlLoader(mdlLoader)+setMdlLoader(mdlLoader)+1;}//Updating mdl loader in apps
// const existsByMdlLoader=(mdlLoader)=>{if(MdlLoader.length>0)getMdlLoader(MdlLoader);else getMdlLoader(0);}
// const getDirectionX(directionX){return directionX;}//Fetching DirX
// const setDirectionX=(directionX)=>{this.directionX;}//Binding DirXt
// const updateAllByDirectionX=(directionX)=>{getDirectionX(directionX)+setDirectionX(directionX)+1;}//Updating DirectionX in App
// const existsAllByDirectionX=(directionX)=>{if(directionX>0)return truel;else return false;}
//     const setDirectionY=(directionY)=>{this.directionY=directionY;}//Binding  Yth Direction in WEBXR
// const getDirectionY=(directionY)=>{return directionY;}//Fetching DirectionY in App
// const updateAllByDirectionY=(directionY)=>{getDirectionY(directionY)+setDirectionY(directionY)+1;]//updating Directipn Y in App
// const getWidth=(width)=>{return width;}//printing Width
// const setWidth=(width)=>{return width;}//Binding Width in It
// const updateByWidth=(width)=>{getWidth(width)+setWidth(width)+1;}//Updating Width in App
// const existsAllByWidth=(width)=>{
//     if(width>0)getWidth(width);
//     else getWidth(0);
//     }
// // const existsByWidth(width)=>{}
// const existsByDirectionY=(directionY)=>{if(directionY>0)getDirectionY(directionY);else getDirectionY(0);}//Checking DirectionY's Existence in App
// const updateAllByWidth=(Width)=>{getWidth(width)+setWidth(width)+1;}//Updating Width in App
// const setDirectionY=(directionY)=>{this.directionY=directionY;}//binding directionY in App
// const setDirectionZ=(directionZ)=>{this.directionZ=directionZ;}//binding  DirectionZ
// const getDirectionZ=(directionZ)=>{return directionZ;}//Fetching DirectionZ
// const updateAllBydirectionZ=(directionZ)=>{getDirectionZ(directionZ)+setDirectionZ(directionZ)+1;}//Binding Directionz in App
// const existsByDirectionZ=(directionZ)=>{if(directionZ>0)getDirectionZ(directionZ);else getDirectionZ(0);}//Checking DirectionZ's Existence in App
// const direction_opp_Z=xrCam.getDirection(-(Axis.Z))+"Camera Direction On Back";
// const Height=xrCam.realWorldHeight;
// const getDirectionopp_Z=(direction_opp_Z)=>{return direction_opp_Z;}//fetching Direction Opp Z in APp
// const setDirectionopp_Z=(direction_opp_Z)=>{this.direction_opp_Z=direction_opp_Z;}//Binding Direction OppZ in APp
// const getHeight=(Height)=>{return Height;}//Fetching height in app
// const setHeight=(Height)=>{this.Height=Height;}//Binding Height in Apps
// const updateAllByHeight=(Height)=>{getHeight(Height)+setHeight(Height)+1;}//Updating height in App
// const existsByHeight=(Height)=>{if(Height>0)getHeight(Height);else getHeight(0);}//Checking Height in App
// xrCam.setTransformationFromNonVRCamera(xrCam,true);
// xrCam.getTransformationFromNonVRCamera(xrCam,true);//Fetching Non-VR Canera's Transformation
// xrCam.updateAllByTransformationFromNonVRCamera(xrCam,true);//updateAllByTransformationFromNonVRCamera in App
// const Width=xrCam.realWorldWidth;
// const Light=new BABYLON.PointLight("pointLight",new BABYLON.Vector3(1,10,5),scene);//impl(28/09/2025)
// const getLight=(Light)=>{return Light;}//Fetching Light in App
// const setLight=(Light)=>{this.Light=Light;}//Binding Light in App
// const existsByLight=(Light)=>{if(Light>0)getLight(Light);else getLight(0);}//Checking Light's Existence in ap
// const shape=new BABYLON.Cylinder(
// new BABYLON.Vector3(0,-.9,0),
// new BABYLON.Vector3(0,+.9,0),
// 1,scene
// );
//
//     const setByMesh=(mesh)=>{this.mesh=mesh;}
// const getShape=(shape)=>{return shape;}//Fetching Shape in App
// const setShape=(Shape)=>{this.shape=shape;}//Binding Shape  in App
// const udpateByShape=(shape)=>{getShape(shape)+setShape(shape)+1;}//Updating shape in App
// const mesh.actionManager=new BABYLON.ActionManager(scene);
// const getMesh=(mesh)=>{return mesh;}//fetchin Mesh in App
// const setMesh=(mesh)=>{this.mesh=mesh;}// binding Mesh in App
// const updateByXRCamera=(xrCam,mesh,scene){getxrCam(xrCam,mesh,scene)+setxrCam(xrCam)+1;}//Updating XR camera in App
// const existsBymesh=(mesh)=>{
// const updateByMesh=(mesh)=>{if(mesh>0)getMesh(mesh)+setMesh(mesh)+1;else getMesh(0)+setMesh(0);}//Updating Mesh in App
//     if(mesh.length>0)getBymesh(mesh);
//     else getBymesh(0);
//     }
// const existsByShape=(shape)=>{
//     if(shape>0)getByShape(shape);
//     else getByShape(0);}//Checking Shape's Existence in App
//     const raycastOutput=new BABYLON.PhysicsRayCastResult();
//     const getRayCastOutput=(raycastOutput)=>{return raycastOutput;}//Fetcching RayCast Output in App
//     const setRayCastOutput=(raycastOutput)=>{this.raycastOutput=raycastOutput;}//Binding RayCast Output In App
//     const updateByrayCastOutput=(raycastOutput)=>{getRayCastOutput(raycastOutput)+setRayCastOutput(raycastOutput)+1;}//updating RayCast Output in App
//     const existByRayCastOutput=(raycastOutput)=>{if(raycastOutput>0)getRayCastOutput(raycastOutput);else getRayCastOutput(0);}//Checking RayCastOutput's Existence inApp