<div class="modal-dialog" style="opacity: 0.9; margin-top: 10%;">
    <div class="modal-content">
        <div class="modal-header">

            <h1 class="text-center">Login</h1>
        </div>
        <div class="modal-body">
            <form class="form col-md-12 center-block" action="Ac.jsp" method="Post">

                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-envelope fa-fw"></i></span>
                    <input type="text" class="form-control input-lg" placeholder="Email" autocomplete="off" name="Name">
                </div>

                <span class="help-block"></span>
                <span class="help-block"></span>

                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                    <input type="password" class="form-control input-lg" placeholder="Password" autocomplete="off" name="Password">
                </div>
                <span class="help-block"></span>
                <div class="form-group">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox">Remember me
                        </label>
                        <span style="margin-left:55%"><a href="Forget.jsp" style="color: #2C4FE6  !important;">Forgot password?</a></span>
                    </div>
                </div>
                <div class="col-md-12">
                    <button type="Submit" value ="login" class="btn btn-primary btn-lg btn-block">Sign In</button>
                    <br>Don't have an account? <a data-toggle="modal" data-target="#myModal" style="color: #2C4FE6  !important;">Register here</a>
                </div>
            </form>
        </div>
        <div class="modal-footer">

        </div>
    </div>
</div>