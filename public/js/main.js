(function(window, undefined){
    var _onload = window.onload;

    window.onload = function(){
        if(_onload){ _onload(); }

        prettyPrint();

        // Change Dates
        if($('p.date')){
            var date = $('p.date').text();
            var timeago = $.timeago($('p.date').text());
            $('p.date').text('Posted: ' + timeago);
            $('p.date').attr('title', date);
        }
    };
}(this));

